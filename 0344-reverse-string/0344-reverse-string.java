class Solution {
    public void reverseString(char[] s) {
        for(int i=0;i<s.length/2;i++){
            int oppIndex=s.length-1-i;
            char temp=s[i];
            s[i]=s[oppIndex];
            s[oppIndex]=temp;
        }
    }
}