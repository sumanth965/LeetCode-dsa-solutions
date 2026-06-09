class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int digit=0;
        int i;
        for(i=0;i<nums.length;i++){
            sum = sum + nums[i];
        
            int num=nums[i];
            while(num>0){
                 digit=digit+num%10;
                 num=num/10;
             }
        }
        if (sum>digit){
            return sum-digit;
        }
        else
        {
            return digit -sum;
        }
    }
}