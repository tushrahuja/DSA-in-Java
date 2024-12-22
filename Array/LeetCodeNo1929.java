
import java.util.Arrays;

public class LeetCodeNo1929 {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 1 };
    System.out.println(Arrays.toString(getConcatenation(nums)));
  }

  static int[] getConcatenation(int[] nums) {
    int[] newA = new int[nums.length * 2];
    for (int idx = 0; idx < nums.length; idx++) {
      newA[idx] = nums[idx];
      newA[nums.length+idx] = nums[idx];
    }
    return newA;
  }
}
