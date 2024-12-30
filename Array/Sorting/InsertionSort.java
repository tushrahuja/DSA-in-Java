
import java.util.Arrays;

public class InsertionSort {
  public static void main(String[] args) {
    int[] arr = { 5, -3, 4, 2, -2, 1, 2, 2, 3, -1};
    insertionSort(arr);
    System.out.println(Arrays.toString(arr));
  }

  static void insertionSort(int[] arr) {

    for (int idx = 0; idx < arr.length - 1; idx++) {
      for (int i = 0; i <= arr.length - 2; i++) {
        for (int j = i + 1; j <= arr.length - 1; j++) {
            if (arr[i] > arr[j]) {
              int temp = arr[i];
              arr[i] = arr[j];
              arr[j] = temp;
            }else{
              break;
            }
          }
      }

    }

  }
}
