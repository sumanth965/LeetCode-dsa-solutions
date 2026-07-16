
class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morseCode={".-","-...","-.-.","-..",".","..-.","--.","....","..",
                               ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
                               "...","-","..-","...-",".--","-..-","-.--","--.."};
        String alphabet="abcdefghijklmnopqrstuvwxyz";
        Set<String> transformations=new HashSet<>();
        for (int i=0;i<words.length;i++){
            String word=words[i];
            String morse="";
            for (int j=0;j<word.length();j++) {
                char ch=word.charAt(j);
                int position=alphabet.indexOf(ch);
                morse=morse + morseCode[position];
            }
            transformations.add(morse);
        }
        return transformations.size();
    }
}