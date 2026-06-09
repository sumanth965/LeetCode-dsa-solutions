class Solution {
    public int subtractProductAndSum(int n) {
        int digit;
        int sum=0;
        int product=1;
        
            while(n>0){
                digit =  n % 10;
                n=n/10;
                sum=sum+digit;
                product=product*digit;
            }
           
            return product-sum;
               
    }
}