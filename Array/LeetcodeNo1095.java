
public class LeetcodeNo1095 {
  public static void main(String[] args) {
    int[] num = {1, 2, 3, 2, 1};
    System.out.println(peakIndexInMountainArray(num));
  }

  static int peakIndexInMountainArray(int[] arr) {

    int lowest = 0;
    int peak = arr.length - 1;

    while (lowest < peak) {
      int mid = lowest + (peak - lowest) / 2;

      if (arr[mid] > arr[mid + 1]) {
        peak = mid;
      } else {
        lowest = mid + 1;
      }
    }
    return lowest;

  }
}
