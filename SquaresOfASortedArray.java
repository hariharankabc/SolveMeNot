
// 977. problems/squares-of-a-sorted-array/
class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        int [] result = new int [nums.length];
        int firstPT = 0;
        int secPT = nums.length-1;
        int i = nums.length-1;
        while(i >= 0){
            if(nums[firstPT] * nums[firstPT] > nums[secPT] * nums[secPT]){
                result[i] = nums[firstPT] * nums[firstPT];
                firstPT++;
            }else{
                result[i] = nums[secPT] * nums[secPT];
                secPT--;
            }
            i--;
        }
        return result;
    }
}
