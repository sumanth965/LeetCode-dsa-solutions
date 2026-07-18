class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxW=0;
        for(int i=0;i<accounts.length;i++){
        int rowSum=0;
            for(int j=0;j<accounts[i].length;j++){
               rowSum+=accounts[i][j];

            }maxW= Math.max(maxW,rowSum);
        }return maxW;
    }
}