public class BinarySearchWithRecursion {
    public static void main(String[] args) {
        int[] arr = { -1, 0, 3, 5, 9, 12 };
        int target = 2;
        System.out.println(search(arr, target, 0, arr.length - 1));
    }

    static int search(int[] nums, int target, int s, int e) {

        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;
        if (target == nums[mid]) {
            return mid;
        }
        if (target > nums[mid]) {
            return search(nums, target, mid + 1, e);
        }
        return search(nums, target, s, mid - 1);
    }
}
