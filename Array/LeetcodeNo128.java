import java.util.Arrays;

public class LeetcodeNo128 {
  public static void main(String[] args) {
    int[] nums = {100,4,200,1,3,2};
    System.out.println(longestConsecutive(nums));
  }
  static int longestConsecutive(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    Arrays.sort(nums);
    int count = 1;
    int leastSmaller = Integer.MIN_VALUE;
    int longest = 1;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] - 1 == leastSmaller) {
        count += 1;
        leastSmaller = nums[i];
      } else if (nums[i] != leastSmaller) {
        leastSmaller = nums[i];
        count = 1;
      }
      longest = Math.max(longest, count);
    }
    return longest;
  }
}
