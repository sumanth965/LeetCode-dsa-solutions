class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        int pre1=nums[0];
        int pre2=Math.max(nums[0],nums[1]);
        
        for(int i=2;i<nums.length;i++){
           int curr=Math.max(pre2,pre1+nums[i]);
           pre1=pre2;
           pre2=curr;
        }
        return pre2;
    }
}