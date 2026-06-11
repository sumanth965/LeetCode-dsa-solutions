class Solution {
    public boolean checkIfPangram(String sentence) {
        char i;
        for( i='a';i<='z';i++){
            if(!sentence.contains(String.valueOf(i)))
            return false;
        }
        return true;
        
    }
}