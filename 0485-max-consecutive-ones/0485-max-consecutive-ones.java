class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOne = 0;
        int count = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 1) {
                count++;
                if (count > maxOne) {
                    maxOne = count;
                }
            } else {
                count = 0;
            }
        }
        return maxOne;
    }
}