class RotateArray {
// 189.problems/rotate-array/
   public void rotate(int[] nums, int k) {
        if (k > nums.length){
            k = k % nums.length;
        }
        int[] suffixArr = Arrays.copyOfRange(nums, nums.length - k, nums.length);
        int[] prefixArr = Arrays.copyOfRange(nums, 0, nums.length - k);
        System.arraycopy(suffixArr, 0, nums, 0, k);
        System.arraycopy(prefixArr, 0, nums, k, prefixArr.length);
    }
}
