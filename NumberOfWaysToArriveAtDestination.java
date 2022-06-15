class Solution {
    // 1976. problems/number-of-ways-to-arrive-at-destination/
    private class Intersection {
        long totalTime;
        int totalPath;
    }
    
    public int countPaths(int n, int[][] roads) {
        int[][] graph = new int[n][n];
        for (int[] road: roads) {
            int firstIntersection = road[0];
            int secondIntersection = road[1];
            int time = road[2];
            graph[firstIntersection][secondIntersection] = time;
            graph[secondIntersection][firstIntersection] = time;
        }
        
        Intersection[] intersections = new Intersection[n];
        for (int i = 0; i < n; i++) {
            intersections[i] = new Intersection();
            intersections[i].totalTime = Long.MAX_VALUE;
            intersections[i].totalPath = 0;
        }
        intersections[0].totalTime = 0;
        intersections[0].totalPath = 1;
        
        boolean[] visited = new boolean[n];
        
        for (int count = 0; count < n; count++) {
            int curIntersection = getUnvisitedIntersectionWithMinimalTotalTime(visited, intersections);
            Intersection curIntersectionData = intersections[curIntersection];
            visited[curIntersection] = true;
            
            for (int intersection = 0; intersection < n; intersection++) {
                if (graph[curIntersection][intersection] > 0) {
                    Intersection neiIntersection = intersections[intersection];
                    long newTotalTime = graph[curIntersection][intersection] + curIntersectionData.totalTime;
                    if (newTotalTime < neiIntersection.totalTime) {
                        neiIntersection.totalTime = newTotalTime;
                        neiIntersection.totalPath = curIntersectionData.totalPath;
                    } else if (newTotalTime == neiIntersection.totalTime) {
                        neiIntersection.totalPath = (
                            neiIntersection.totalPath + curIntersectionData.totalPath
                        ) % 1_000_000_007;
                    }
                }
            }
        }
        
        return intersections[n-1].totalPath;
        
        
    }
    
    private int getUnvisitedIntersectionWithMinimalTotalTime(boolean[] visited, 
                                                             Intersection[] intersections) {
        int n = intersections.length;
        int targetIntersection = -1;
        for (int intersection = 0; intersection < n; intersection++) {
            if (!visited[intersection] 
                && (targetIntersection == -1 
                    || intersections[targetIntersection].totalTime > intersections[intersection].totalTime)) {
                targetIntersection = intersection;
            }
        }
        return targetIntersection;
    }
    
}
