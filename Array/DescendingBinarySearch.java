public class DescendingBinarySearch {
  public static void main(String[] args) {
    // Initializing the array in descending order
    int[] arr = {59, 56, 48, 45, 39, 35, 23, 21, 20, 12, 0, -2};
    int target = 39;  // Target value to search for
    int val = binarySearch(arr, target);  // Perform binary search
    System.out.println(val);  // Print the result (index of target)
  }

  static int binarySearch(int[] arr, int target) {
    int start = 0;  // Starting index of the search range
    int end = arr.length - 1;  // Ending index of the search range

    // Continue searching while there is a valid range
    while (start <= end) {
      int mid = start + (end - start) / 2;  // Calculate the middle index

      // If the target is less than the mid element, search the right half
      if (target < arr[mid]) {
        start = mid + 1;
      // If the target is greater than the mid element, search the left half
      } else if (target > arr[mid]) {
        end = mid - 1;
      // If the target is equal to the mid element, return the index
      } else {
        return mid;
      }
    }

    return -1;  // Return -1 if the target is not found
  }
}
