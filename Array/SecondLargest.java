public class SecondLargest {
  public static void main(String[] args) {
    // * Initialize array with integers
    int[] arr = { 20, 10, 10, 6, 8, 12, 13, 14, 16, 19, -1};
    // * Print the second largest element in the array
    System.out.println(secondLargest(arr));
  }

  static int secondLargest(int[] arr) {
    // * Initialize second largest as minimum possible integer value
    int slargest = Integer.MIN_VALUE;
    // * Initialize largest as the first element of the array
    int largest = arr[0];

    // * Loop through the array to find the largest and second largest elements
    for (int i = 0; i < arr.length; i++) {
      // ! If the current element is greater than the largest, update slargest and largest
      if (arr[i] > largest) {
        slargest = largest;
        largest = arr[i];
      }
      // ! If the current element is greater than the second largest and not equal to the largest, update slargest
      else if (arr[i] > slargest && arr[i] != largest){ 
        slargest = arr[i];
      }
    }

    // * If second largest is still the minimum possible value, return -1
    if (slargest == Integer.MIN_VALUE) {
      return -1;
    }

    // * Return the second largest element
    return slargest;
  }
}
