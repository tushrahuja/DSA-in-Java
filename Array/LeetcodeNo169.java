
import java.util.Arrays;

public class LeetcodeNo169 {
  public static void main(String[] args) {
    int[] nums = {3,2,3};
    System.out.println(majorityElement(nums));
  }

  static int majorityElement(int[] nums) {
      Arrays.sort(nums);
      return nums[nums.length/2];
  }
}
