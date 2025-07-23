public class LeetcodeNo153 {
  public static void main(String[] args) {
    int[] nums = {3, 4, 5, 1, 2};
    int min = findMin(nums);
    System.out.println("Minimum value is: " + min);
  }
  static int findMin(int[] nums) {
        int min = search(nums);
        return min;
    }

    static int search(int[] arr) {
        int low = 0;
        int high = arr.length-1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(mid < high && arr[mid+1]<arr[mid]){
                return arr[mid+1];
            }
            else if(mid > low && arr[mid] < arr[mid-1]){
                return arr[mid];
            } 
            else if(arr[high]>arr[mid]) {
                high = mid - 1;
            }
            else {
                low = mid+1;
            }
        }
        return arr[0];
    }
}
