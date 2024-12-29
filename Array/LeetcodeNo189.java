
import java.util.Arrays;

public class LeetcodeNo189 {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3};
    int k = 4;
    rotate(arr, k);
    System.out.println(Arrays.toString(arr));
  }

  static void rotate(int[] nums, int k){
      k = k % nums.length;
      swap(nums, 0, nums.length-1);
      swap(nums, 0, k-1);
      swap(nums, k, nums.length -1);
    
  }
  
  static void swap(int[] nums, int start, int end) { 
    while (start < end) { 
      int temp = nums[start]; 
      nums[start] = nums[end]; 
      nums[end] = temp; 
      start++; 
      end--; 
    } 
  }
}
