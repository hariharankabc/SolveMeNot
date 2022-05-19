class ClimbingStairs {
// 70.problems/climbing-stairs
    public int climbStairs(int n) {
        int nextStep = 1;
        int nextnextStep = 0;
        int curCount = 0;
        for (int i=n-1; i>=0; i--) {
            curCount += nextStep;
            if (i < n-1) {
                curCount += nextnextStep;
            }
            nextnextStep = nextStep;
            nextStep = curCount;
            curCount = 0;
        }
        return nextStep;
    }
}
