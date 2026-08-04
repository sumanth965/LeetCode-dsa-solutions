class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        int maxOdd = 0;
        int minEven = Integer.MAX_VALUE;
        for (int count : freq) {
            if (count == 0) {
                continue;
            }
            if (count % 2 == 0) {
                minEven = Math.min(minEven, count);
            } else {
                maxOdd = Math.max(maxOdd, count);
            }
        }
        return maxOdd - minEven;
    }
}