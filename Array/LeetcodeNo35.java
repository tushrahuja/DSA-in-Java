public class LeetcodeNo35 {
  public static void main(String[] args) {
    int[] arr ={1,3,5,6};
    int target = 7;
    System.out.println(searchInsert(arr, target));
  }

  static int searchInsert(int[] nums, int target) {
    int start = 0;
    int end = nums.length - 1;
    
    while(start <= end){
      int mid = start + (end - start) / 2;

      if(target == nums[mid]){
        return mid;
      }
      if(target > nums[mid]){
        start = mid + 1;
      }
      else if(target < nums[mid]){
        end = mid - 1;
      }
      
    }
    return start;
  }
}
