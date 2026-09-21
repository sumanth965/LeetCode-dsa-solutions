class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int cnt=1;
        int maxCnt=1;
        if(nums.length==0){
            return 0;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                continue;
            }
            if(nums[i-1]==(nums[i]-1)){
                cnt++;
            }else{
                maxCnt=Math.max(cnt,maxCnt);
                cnt=1;
            }
            
        }
        return Math.max(cnt,maxCnt);
    }
}