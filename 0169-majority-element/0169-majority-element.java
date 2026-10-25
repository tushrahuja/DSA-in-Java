class Solution {
    public int majorityElement(int[] arr) {
        int count = 0;
        int candidate = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                candidate = arr[i];
            }
            if (arr[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
}