class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;

        while (left < right) {
            while (left < right && !vowels.contains(chars[left]))  left++;
            while (left < right && !vowels.contains(chars[right])) right--;
            if (left < right) {
                char tmp = chars[left];
                chars[left]  = chars[right];
                chars[right] = tmp;
                left++;
                right--;
            }
        }

        return new String(chars);
    }
}