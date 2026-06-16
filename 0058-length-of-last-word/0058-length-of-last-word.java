class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        String word[]=s.split(" ");
        int wordLength = word[ word.length - 1 ].length();
        return wordLength;
    }
}