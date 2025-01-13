
import java.util.Arrays;

public class LeetcodeNo136 {
  public static void main(String[] args) {
    int[] nums = {2,2,1};
    System.out.println(singleNumber(nums));
  }

  static int singleNumber(int[] nums) {
    Arrays.sort(nums);
    if(nums.length == 1){
        return nums[0];
    }
      for (int i = 0; i < nums.length - 1; i+=2) {
        if(nums[i] != nums[i+1]){
          return nums[i];
        }
      }
      return nums[nums.length -1];
  }
}
