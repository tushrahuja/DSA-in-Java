
import java.util.Arrays;

public class LeetcodeNo137 {
  public static void main(String[] args) {
    int[] nums = {2,2,3,2};
    System.out.println(singleNumber(nums));
  }

  static int singleNumber(int[] nums) {
    Arrays.sort(nums);
    for (int i = 0; i < nums.length-1; i+=3) {
      if(nums[i] != nums[i+1]){
       return nums[i];
      }
    }

    return nums[nums.length - 1];
  }
}
