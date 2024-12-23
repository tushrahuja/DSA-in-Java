import java.util.Arrays;

public class LeetcodeNo1365 {
  public static void main(String[] args) {
    int[] arr = {8,1,2,2,3};
    System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));


  }

  static int[] smallerNumbersThanCurrent(int[] nums) {
    int[] newArr = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      int count = 0;
      for(int j = 0; j < nums.length;j++){
          if(nums[i]>nums[j]){
            count ++;
          }
        }
        newArr[i] = count;
    }
  return newArr; 
  }
}
