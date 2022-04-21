class BinarySearch {
// 704.problems/binary-search/
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int targetIndex = -1;
        while(start <= end){
            int currentRootElement = (start+end)/2;
            if(nums[currentRootElement]==target){
                targetIndex = currentRootElement;
                break;
            }else if(nums[currentRootElement]<target){
                start = currentRootElement + 1;
            }else{
                end = currentRootElement - 1;
            }
        }
        return targetIndex;
    }
}
