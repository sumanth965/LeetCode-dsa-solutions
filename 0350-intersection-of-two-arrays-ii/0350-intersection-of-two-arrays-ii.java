class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
    List<Integer> set=new ArrayList<>();
    boolean[] used=new boolean[nums2.length];
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(!used[j]){
                if( nums1[i]==nums2[j]){
                    set.add(nums2[j]);
                    used[j]=true;
                    break;
                }
                }
            }
        }
        int result[]=new int[set.size()];
        int k=0;
        for(int num:set){
            result[k]=num;
            k++;
        }
        return result;
    }
}