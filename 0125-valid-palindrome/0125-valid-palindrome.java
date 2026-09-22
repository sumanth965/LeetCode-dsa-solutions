class Solution {
    public boolean isPalindrome(String s) {
        String lowerCase=s.toLowerCase();
        String str=lowerCase.replaceAll("[^a-z0-9]","");
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }return str.equals(rev);
    }
}