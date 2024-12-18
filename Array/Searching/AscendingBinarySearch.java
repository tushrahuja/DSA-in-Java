public class AscendingBinarySearch {
  public static void main(String[] args) {
    // Initializing the array in ascending order
    int[] arr = {-2, 0, 3, 8, 12, 15, 23, 34, 45, 48, 56, 78};
    int target = 8;  // Target value to search for
    
    // Perform binary search and get the index of the target value
    int val = binarySearch(arr, target);
    System.out.println(val);  // Print the result (index of target)
  }

  static int binarySearch(int[] arr, int target) {
    int start = 0;  // Starting index of the search range
    int end = arr.length - 1;  // Ending index of the search range

    // Continue searching while there is a valid range
    while (start <= end) {
      // Calculate the middle index to avoid overflow
      int mid = start + (end - start) / 2;

      // If the target is present at mid, return the mid index
      if (arr[mid] == target) {
        return mid;
      }

      // If the target is greater than the mid element, it must be in the right subarray
      if (target > arr[mid]) {
        start = mid + 1;
      } 
      // If the target is less than the mid element, it must be in the left subarray
      else {
        end = mid - 1;
      }
    }

    return -1;  // Target not found, return -1
  }
}
