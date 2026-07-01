class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int result[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            result[i]=-1;
        }
        for(int i=0;i<nums1.length;i++){
            for(int j=1;j<nums2.length;j++){
                if(nums1[i]==nums2[j-1]){
                    for(int k=j;k<nums2.length;k++){
                       if(nums2[k]>nums1[i]){
                            result[i]=nums2[k];
                            break;
                        }
                    }
                }
            }
        }return result;
    }
}