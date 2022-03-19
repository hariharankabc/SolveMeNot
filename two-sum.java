// problems/two-sum/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> inputMap = new HashMap<Integer, Integer>();
        int outPut[] = new int[2]; 
        for(int i=0; i<nums.length; i++){
            int requiredNum = target-nums[i];
            if(requiredNum > -1 && inputMap.containsKey(requiredNum)){
                outPut[0] = inputMap.get(requiredNum);
                outPut[1] = i;
                break;
            }else{
                inputMap.put(nums[i],i);
            }
        }
        return outPut;
    }
}
