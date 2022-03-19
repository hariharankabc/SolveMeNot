// problems/merge-sorted-array/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int totalIndex = m + n;
        if (n==0)
            return;
        for (int i = totalIndex-1, j = m-1; j >= 0 ; i--, j--){
            nums1[i] = nums1[j];
        }
        for (int index=0, sIndex1= n, sIndex2=0; index<sIndex1; index++){
            if(sIndex1<totalIndex && nums1[sIndex1]<nums2[sIndex2]){
                nums1[index]=nums1[sIndex1];
                ++sIndex1;
            }else{
                nums1[index] = nums2[sIndex2];
                sIndex2++;
            }
        }
    }
}
