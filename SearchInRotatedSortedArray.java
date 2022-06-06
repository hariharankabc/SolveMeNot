class SearchInRotatedSortedArray {
// 33. problems/search-in-rotated-sorted-array/
    public int search(int[] nums, int target) {
        if(nums == null)
            return -1;
        return search(nums, target, 0, nums.length-1);
    }
    
    public int search(int[] nums, int key, int low, int high){
        int mid = (low+high)/2;
        if(nums[mid] == key)
            return mid;
        if(low > high)
            return -1;
        
        if(nums[low] <= nums[mid]){
            if(nums[low] <= key && nums[mid] >= key){
                return search(nums, key, low, mid-1);
            }else{
                return search(nums, key, mid+1, high);
            }
        }else{
            if(nums[mid] <= key && nums[high] >= key){
                return search(nums, key, mid+1, high);
            }else{
                return search(nums, key, low, mid-1);
            }
        }
    }
}
