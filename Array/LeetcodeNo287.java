public class LeetcodeNo287 {
  public static void main(String[] args) {
    int[] nums = {1, 3, 4, 2, 2};
    int duplicate = findDuplicate(nums);
    System.out.println("Duplicate number is: " + duplicate);
  }
  static int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        slow = nums[slow];
        fast = nums[nums[fast]];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        slow = nums[0];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return fast;
    }
}
