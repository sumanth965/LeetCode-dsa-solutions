class Solution {
    public boolean repeatedSubstringPattern(String s) {
        for(int i=1;i<s.length();i++){
            if(s.length()%i!=0){
                continue;
            }
            String sub=s.substring(0,i);
            String repeated=sub.repeat(s.length()/i);
            if(repeated.equals(s)){
                return true;
            }
        }return false;
    }
}