class Solution {
    public int arraySign(int[] nums) {
        double result=nums[0];
        for(int i=1;i<nums.length;i++){
            result=result*nums[i];
        }if(result<0){
            return -1;
        }else if(result>0){
            return 1;
        }else{
            return 0;
        }
    }
}