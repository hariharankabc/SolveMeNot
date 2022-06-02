class FindFirstAndLastPositionOfElementInSortedArray {
// 34. problems/find-first-and-last-position-of-element-in-sorted-array
    public int[] searchRange(int[] nums, int target) {
              int l =0;
        int r = nums.length-1;
        //initialize array
        int[]range = new int [] {-1,-1};
        //base case
        if(nums.length ==1 && nums[0]==target){
            range[0]=0;
            range[1]=0;
            return range;
        }
        //apply binary search
        while(l<=r){
           int mid = l + (r-l)/2;
            if(nums[mid]==target){
                //find subarray
                int start = mid;
                int end = mid;
                ///find min index
                while(start>0 && nums[start-1]==target){
                  start--;
                }
                //find max index
                while(end<nums.length-1 && nums[end+1]==target ){
                   end++;
                }
            //update range
                range[0]= start;
                range[1]=end;
                return range;
               
            }
            else if(nums[mid]<target){
                l = mid+1;
            }
            else if(nums[mid]>target){
                r = mid-1;
            }
        }
        return range;
        
    }
}
