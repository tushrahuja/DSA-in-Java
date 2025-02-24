import java.util.Arrays;

public class LeetcodeNo2149 {
  public static void main(String[] args) {
    int[] arr = {3,1,-2,-5,2,-4};
    System.out.println(Arrays.toString(rearrangeArray(arr)));
  } 
  static int[] rearrangeArray(int[] nums) {
    int posIndex = 0;
    int negIndex = 1;
    int[] arr = new int[nums.length];
    for(int i = 0; i < nums.length; i++){
      if(nums[i] < 0){
        arr[negIndex] = nums[i];
        negIndex += 2;
      }
      else{
        arr[posIndex] = nums[i];
        posIndex += 2;
      }
    }
  return arr;
} 
}

