public class OrderAgnosticBinarySearch {
  public static void main(String[] args) {
    // Array sorted in descending order
    int[] arr = {59, 56, 48, 45, 39, 35, 23, 21, 20, 12, 0, -2};
    int target = 20;  // Target value to search for
  
    // Perform the binary search and get the index of the target value
    int val = binarySearch(arr, target);
    System.out.println(val);  // Print the result
  }

  static int binarySearch(int[] arr, int target) {
    int start = 0;  // Starting index of the search range
    int end = arr.length - 1;  // Ending index of the search range

    // Determine if the array is sorted in ascending or descending order
    boolean isAsc = arr[start] < arr[end];
    
    // Continue searching while there is a valid range
    while (start <= end) {
      // Calculate the middle index to avoid overflow
      int mid = start + (end - start) / 2;

      // Check if the target is present at mid
      if (arr[mid] == target) {
        return mid;  // Target found, return the index
      }

      if (isAsc) {
        // If the array is sorted in ascending order
        if (target < arr[mid]) {
          end = mid - 1;  // Target is in the left half
        } else {
          start = mid + 1;  // Target is in the right half
        }
      } else {
        // If the array is sorted in descending order
        if (target > arr[mid]) {
          end = mid - 1;  // Target is in the left half
        } else {
          start = mid + 1;  // Target is in the right half
        }
      }
    }

    return -1;  // Target not found, return -1
  }
}
