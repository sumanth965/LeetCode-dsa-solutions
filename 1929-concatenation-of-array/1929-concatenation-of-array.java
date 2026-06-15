class Solution {
    public int[] getConcatenation(int[] nums) {
         int arrs[]=nums;
         int n=nums.length;
         int result[]=new int[n*2];
         for(int i=0;i<n;i++){
             result[i]=nums[i];
             result[i+n]=arrs[i];
         }
         return result;
    }
}