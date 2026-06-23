class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int expectedSum=n*(n+1)/2;
        int actualResult=0;
        for(int i=0;i<n;i++){
            actualResult+=nums[i];
        }return expectedSum-actualResult;
    }
}