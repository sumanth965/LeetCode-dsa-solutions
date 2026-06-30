class Solution {
    public int[] applyOperations(int[] nums) {
        int k=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                nums[i-1]=nums[i-1]*2;
                nums[i]=0;
            }
            if(nums[i-1]!=0){
                nums[k]=nums[i-1];
                k++;
            }
            
        }
        if(nums[nums.length-1]!=0){
            nums[k]=nums[nums.length-1];
            k++;
        }
        while(k<nums.length){
                nums[k]=0;
                k++;
        }
        return nums;
        
    }
}