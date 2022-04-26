class MajorityElement {
// 169. problems/majority-element/
    public int majorityElement(int[] nums) {
        int majorityElement=0;
        int count=0;
        for (int num:nums){
           if(count==0)
               majorityElement=num;
           if(majorityElement==num)
               count++;
           else
               count--;
        }
        return majorityElement;
    }
}
