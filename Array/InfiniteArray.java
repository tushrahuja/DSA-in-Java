
public class InfiniteArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 9, 12, 15, 17, 19, 21, 26, 31, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52};
        int target = 51;
        System.out.println(findLength(arr, target));

    }

    static int findLength(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        // Continue searching while there is a valid range
        while (start <= end) {
            // Calculate the middle index to avoid overflow
            int mid = start + (end - start) / 2;

            // If the target is greater than the mid element, it must be in the right subarray
            if (target > arr[mid]) {
                start = mid + 1;
            } // If the target is less than the mid element, it must be in the left subarray
            else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;  // Target not found, return -1
    }
}
