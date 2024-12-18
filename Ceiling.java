public class Ceiling {
  public static void main(String[] args) {
    // Array sorted in descending order
    int[] arr = {18, 16, 14, 12, 9, 5, 2};
    int target = 15;  // Target value to search for
  
    // Perform the binary search and get the ceiling value
    int val = binarySearch(arr, target);
    System.out.println(val == -1 ? "No ceiling found" : "Ceiling of " + target + " is " + val);
  }

  static int binarySearch(int[] arr, int target) {
    int start = 0;  // Starting index of the search range
    int end = arr.length - 1;  // Ending index of the search range

    // Determine if the array is sorted in ascending or descending order
    boolean isAsc = arr[start] < arr[end];

    // Edge case: If the target is outside the bounds of the array
    if (isAsc) {
      if (target > arr[end]) { 
        return -1; // No ceiling found 
      } 
    } else {
      if (target > arr[start]) { 
        return -1; // No ceiling found 
      } 
    }
    
    // Continue searching while there is a valid range
    while (start <= end) {
      // Calculate the middle index to avoid overflow
      int mid = start + (end - start) / 2;
      
      // Check if the target is present at mid
      if (arr[mid] == target) {
        return arr[mid];  // Target found, return the element
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

    // Return the ceiling element or indicate no ceiling found
    return isAsc ? arr[start] : arr[end];
  }
}
