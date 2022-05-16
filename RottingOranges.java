class RottingOranges {
// 994. problems/rotting-oranges/
    public int orangesRotting(int[][] grid) {
        for (int x = 0; x < grid.length; x++) {
            for (int y = 0; y < grid[x].length; y++) {
                if (grid[x][y] == 2) {
                    DFS(x, y, grid.length, grid[x].length, grid, 2);
                }
            }
        }
        
        int minTime = 2;
        
        for (int x = 0; x < grid.length; x++) {
            for (int y = 0; y < grid[x].length; y++) {
                if (grid[x][y] == 1) {
                    return -1;
                } else {
                    minTime = Math.max(minTime, grid[x][y]);
                }
            }
        }
        return minTime - 2;
    }
    
    public void DFS(int x, int y, int width, int height, int[][] grid, int time) {
        if (x < 0 || y < 0 || x >= width || y >= height || grid[x][y] == 0) {
            return;
        }
        if (grid[x][y] != 1 && grid[x][y] < time) {
            return;
        } else {
            grid[x][y] = time;
        }
        DFS(x + 1, y, width, height, grid, time + 1);
        DFS(x - 1, y, width, height, grid, time + 1);
        DFS(x, y + 1, width, height, grid, time + 1);
        DFS(x, y - 1, width, height, grid, time + 1);
    }
}
