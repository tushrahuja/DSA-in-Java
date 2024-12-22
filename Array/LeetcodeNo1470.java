
import java.util.Arrays;

public class LeetcodeNo1470 {
  public static void main(String[] args) {
    int[] nums = { 2, 5, 1, 3, 4, 7 };
    int n = 3;
    System.out.println(Arrays.toString(shuffle(nums, n)));
  }

  
  static int[] shuffle(int[] nums, int n) {
    int first = 0;
    int second = n;
    int[] newArr = new int[2 * n];
    for (int index = 0; index < 2 * n; index++) {
      if (index % 2 == 0) {
        newArr[index] = nums[first];
        first++;
      } else {
        newArr[index] = nums[second];
        second++;
      }
    }
    return newArr;
  }
}
