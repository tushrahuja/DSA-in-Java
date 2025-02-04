public class SecondLargest {
  public static void main(String[] args) {
    int[] arr = { 10, 10, 10, 9};
    System.out.println(secondLargest(arr));
  }

  static int secondLargest(int[] arr) {
    int slargest = Integer.MIN_VALUE;
    int largest = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > largest) {
        largest = arr[i];
      }
    }

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > slargest && arr[i] != largest) {
        slargest = arr[i];
      }
    }

    if (slargest == Integer.MIN_VALUE) {
      return -1;
    }

    return slargest;
  }
}
