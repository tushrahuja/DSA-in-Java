class Solution {
    public int maxProduct(int[] nums) {
        int product = 1;
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            product = nums[i];

            if (product < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            maxProduct = Math.max(product, maxProduct * product);
            minProduct = Math.min(product, minProduct * product);

            result = Math.max(result, maxProduct);
        }

        return result;
    }
}