class Solution {
    public int findJudge(int n, int[][] trust) {
    // 997. problems/find-the-town-judge
        int count=0;
        int differenceCount = n-1;
        int[] residentArray = new int[n+1];
        int fromValue = 0;
        int toValue = 0;
        for(int i=0; i<trust.length;i++){
            fromValue = trust[i][0];
            toValue = trust[i][1];
            residentArray[fromValue] = -1;
            if(residentArray[toValue] != -1){
                residentArray[toValue] = residentArray[toValue] + 1;
            }
        }
        for(int i=1; i<=n; i++){
            if(residentArray[i]==n-1){
                return i;
            }
        }
        return -1;
    }
}
