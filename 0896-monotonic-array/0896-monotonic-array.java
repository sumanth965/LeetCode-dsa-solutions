class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean increase=true;
        boolean decrese=true;
        int i;
        for(i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                decrese=false;
            }
            if(nums[i]>nums[i+1]){
                increase=false;
            }
        }
        return increase||decrese;
    }
}