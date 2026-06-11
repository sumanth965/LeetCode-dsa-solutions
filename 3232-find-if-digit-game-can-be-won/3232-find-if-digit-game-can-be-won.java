class Solution {
    public boolean canAliceWin(int[] nums) {
        int asum=0;
        int bsum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10)
            {
                asum=asum+nums[i];
            }
            else {
                bsum=bsum+nums[i];
            }

        }
        return asum != bsum;   

    }
}