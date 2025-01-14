
public class LeetcodeNo283 {
  public static void main(String[] args) {
    int[] nums = { 0, 1, 0, 3, 12 };
    moveZeroes(nums);
  }

  static void moveZeroes(int[] nums) {
    int num = 0;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        int temp = nums[i];
        nums[i] = nums[num];
        nums[num] = temp;
        num++;
      }
    }
  }
}