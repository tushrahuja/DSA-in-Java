public class LinearSearch {
  public static void main(String[] args) {
    // Initialize an array of integers
    int[] nums = {3, 9, 21, 13, 45, 33, 67, 17, 19, 81};
    // Define the target value to search for
    int target = 19;
    // Print the result of the linear search
    System.out.println(linearSearch(nums, target));
  }

  static int linearSearch(int[] arr, int target){
    // Check if the array is empty
    if(arr.length == 0){
      return -1;  // Return -1 if the array is empty
    }

    // Iterate through each element in the array
    for (int index = 0; index < arr.length; index++) {
      int elem = arr[index];  // Get the current element
      if(elem == target){  // Check if the current element is the target
        return index;  // Return the index if the target is found
      }
    }
    // Return -1 if the target is not found in the array
    return -1;
  }
}
