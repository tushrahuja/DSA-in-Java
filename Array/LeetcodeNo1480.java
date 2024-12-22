import java.util.Arrays;

public class LeetcodeNo1480 {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4 };
    System.out.println(Arrays.toString(runningSum(arr)));
  }

  static int[] runningSum(int[] nums) {
    int sum = 0;
    for (int idx = 0; idx < nums.length; idx++) {
      sum = sum + nums[idx];
      nums[idx] = sum;
    }
    return nums;
  }
}
