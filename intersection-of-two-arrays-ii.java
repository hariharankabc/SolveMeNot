// problems/intersection-of-two-arrays-ii/
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> integerMap = new HashMap<Integer, Integer>();
        List<Integer> array = new ArrayList<Integer>();
        for(int i: nums1){
            if(integerMap.containsKey(i)){
                int value = integerMap.get(i) + 1;
                integerMap.put(i,value);
            }else{
                integerMap.put(i,1);
            }
        }
        for(int j: nums2){
            if(integerMap.containsKey(j)){
                int value = integerMap.get(j) - 1;
                array.add(j);
                if(value==0){
                    integerMap.remove(j);
                }else{
                    integerMap.put(j,value);
                }
            }
        }
        return array.stream().mapToInt(Integer::intValue).toArray();
    }
}
