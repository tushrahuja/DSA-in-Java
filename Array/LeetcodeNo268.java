public class LeetcodeNo268 {
  public static void main(String[] args) {
    int[] arr = {3,0,1};
    System.out.println(missingNumber(arr));
  }
  static int missingNumber(int[] nums) {
    cyclicSort(nums);
    for(int i = 0; i < nums.length; i++){
      if(nums[i] != i){
        return i;
      }
    }
    return nums.length;
  }
  static void cyclicSort(int[] arr){
    int i = 0;
    while(i < arr.length){
      int correct = arr[i];
      if(arr[i] < arr.length && arr[i] != arr[correct]){
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
      }
      else{
        i++;
      }
    }
  }
}
