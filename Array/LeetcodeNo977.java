import java.util.Arrays;

public class LeetcodeNo977 {
  public static void main(String[] args) {
    int[] arr = {-4,-1,0,3,10};
    System.out.println(Arrays.toString(sortedSquares(arr)));
  }

  static int[] sortedSquares(int[] nums) {
    int[] newArr = new int[nums.length];
      for (int idx = 0; idx < nums.length; idx++) {
        newArr[idx] = nums[idx]*nums[idx];
      }
    insertionSort(newArr); 
    return newArr;
  }
  static void insertionSort(int[] arr){

    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1;j>0; j--) {
        if(arr[j]<arr[j-1]){
          int temp = arr[j-1];
          arr[j-1] = arr[j];
          arr[j] = temp;
        }
        else
          break;
      }
    }
  }
}
