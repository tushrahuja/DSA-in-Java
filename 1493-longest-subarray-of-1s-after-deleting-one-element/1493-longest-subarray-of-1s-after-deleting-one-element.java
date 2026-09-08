class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int right = 0;
        int count = 0;
        int ans = 0;
        while(right < nums.length){
            if(nums[right] == 0){
                count++;
            }
            while(count>1){
                if(nums[left]==0){
                    count--;
                }
                left++;
            }
            int length = right - left + 1;
            ans = Math.max(ans, length);
            right++;
        }
        return ans - 1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna