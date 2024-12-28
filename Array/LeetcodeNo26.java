
public class LeetcodeNo26 {
  public static void main(String[] args) {
    int[] nums = { 1, 1, 2, 2, 2, 3, 3, 4, 4 };
    System.out.println(removeDuplicates(nums));

  }

  static int removeDuplicates(int[] nums) {
    int start = 0;
    
    for (int idx = 0; idx < nums.length - 1; idx++) {
        if(nums[idx]!=nums[idx+1]){
          nums[start]=nums[idx];
          start++;
        }
      }
      nums[start] = nums[nums.length-1];
      
      return start+1;
  }
}