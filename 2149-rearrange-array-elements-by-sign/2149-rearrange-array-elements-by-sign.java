class Solution {
    public int[] rearrangeArray(int[] nums) {
        int posIndex = 0;
        int negIndex = 1;
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                arr[negIndex] = nums[i];
                negIndex += 2;
            } else {
                arr[posIndex] = nums[i];
                posIndex += 2;
                
            }
        }
        return arr;
    }
}