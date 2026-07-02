class Solution {
    public boolean isPalindrome(String s) {
        String lowerCase = s.toLowerCase();
        String result = lowerCase.replaceAll("[^a-z0-9]", "");

        String rev = "";

        for (int i = result.length() - 1; i >= 0; i--) {
            rev += result.charAt(i);
        }

        return result.equals(rev);
    }
}