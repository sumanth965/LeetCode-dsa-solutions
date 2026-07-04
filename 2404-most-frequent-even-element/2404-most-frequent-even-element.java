import java.util.Arrays;

class Solution {
    public int mostFrequentEven(int[] nums) {
        Arrays.sort(nums);

        int ans = -1;
        int maxFreq = 0;
        int i = 0;

        while (i < nums.length) {
            int count = 1;
            int j = i + 1;

            while (j < nums.length && nums[j] == nums[i]) {
                count++;
                j++;
            }

            if (nums[i] % 2 == 0) {
                if (count > maxFreq) {
                    maxFreq = count;
                    ans = nums[i];
                }
            }

            i = j;
        }

        return ans;
    }
}