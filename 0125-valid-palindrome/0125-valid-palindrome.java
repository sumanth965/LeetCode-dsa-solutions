class Solution {
    public boolean isPalindrome(String s) {
        String lowerCase=s.toLowerCase();
        String res=lowerCase.replaceAll("[^a-z0-9]","");
        String rev="";
        for(int i=res.length()-1;i>=0;i--){
            rev=rev+res.charAt(i);
        }return res.equals(rev);
    }
}