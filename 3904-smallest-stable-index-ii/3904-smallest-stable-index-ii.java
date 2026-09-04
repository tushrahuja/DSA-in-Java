class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int n = nums.length;
        int[] minArr = new int[n];
        for (int m = n - 1; m >= 0; m--) {
            min = Math.min(min, nums[m]);
            minArr[m] = min;
        }
        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
            if (max - minArr[i] <= k) {
                return i;
            }
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna