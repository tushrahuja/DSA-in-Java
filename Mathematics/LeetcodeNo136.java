

public class LeetcodeNo136 {
  public static void main(String[] args) {
    int[] nums = { 3, 3, 1, 6, 1, 7, 7};
    System.out.println(singleNumber(nums));
  }

  static int singleNumber(int[] nums) {
    int unique = 0;

    for (int i : nums) {
      unique ^= i;
    }

    return unique;
  }
}
