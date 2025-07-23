public class LeetcodeNo540 {
  public static void main(String[] args) {
    int[] nums = {1, 1, 2, 2, 3, 3, 4, 4, 5};
    int result = singleNonDuplicate(nums);
    System.out.println("Single non-duplicate element is: " + result);
  }
  // static int singleNonDuplicate(int[] nums) { //!BruteForce
  //       for(int i = 1; i < nums.length; i++){
  //           if(nums[i-1] != nums[i]){ 
  //               return nums[i-1];
  //           }
  //           else{
  //               i++;
  //           }
  //       }
  //       return nums[nums.length-1];
  //   } 
    //Now let's implement a more efficient solution using binary search
    static int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // Ensure mid is even //why? to compare pairs of elements
            // If mid is odd, decrement it to make it even
            if (mid % 2 == 1) { //why? to ensure we are always comparing pairs
                mid--;
            }

            // Check if the pair is valid
            if (nums[mid] == nums[mid + 1]) {
                low = mid + 2; // Move to the right side //Why? because we found a valid pair, so the single element must be on the right
            } else {
                high = mid; // Move to the left side //why? because we found an invalid pair, so the single element must be on the left
            }
        }
        return nums[low]; // The single element will be at the low index
    }
}
