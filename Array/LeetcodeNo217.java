import java.util.Arrays;

public class LeetcodeNo217 {
  public static void main(String[] args) {
    int[] arr = { 3, 1, 2 };
    System.out.println(containsDuplicates(arr));
  }

  static  boolean containsDuplicates(int[] nums) {
    Arrays.sort(nums);
    for (int idx = 0; idx < nums.length - 1; idx++) {
      if (nums[idx] == nums[idx + 1]) {
        return true;
      }
    }

    return false;
    }
}
