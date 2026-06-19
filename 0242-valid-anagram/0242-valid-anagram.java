class Solution {
    public boolean isAnagram(String s, String t) {
        int str1 = s.length();
        int str2 = t.length();  
        
        if (str1 != str2) {
            return false;
        }
        
        int[] count = new int[26];
        
        for (int i = 0; i < str1; i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        
        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }
        
        return true;
    }
}