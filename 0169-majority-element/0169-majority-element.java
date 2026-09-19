class Solution {
    public int majorityElement(int[] nums) {
        // int cnt=0;
        // int can=0;
        // for(int i=0;i<nums.length;i++){
        Arrays.sort(nums);
        return nums[nums.length/2];

        }
    }
