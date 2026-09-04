class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int res = -1;
        for (int i = 0; i < nums.length; i++) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int j = 0; j <= i; j++) {
                max = Math.max(max, nums[j]);
            }
            for (int m = i; m < nums.length; m++) {
                min = Math.min(min, nums[m]);
            }
            int score = max - min;
            if (score <= k) {
                return i;
            }
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna