import java.util.ArrayList;
import java.util.Arrays;

public class LeetcodeNo349 {
  public static void main(String[] args) {
    int[] nums1 = {1,2,2,1};
    int[] nums2 = {2,2};
    System.out.println(Arrays.toString(intersection(nums1, nums2)));
  }

  static int[] intersection(int[] nums1, int[] nums2) {
    ArrayList<Integer> list = new ArrayList<>();
    Arrays.sort(nums1);
    Arrays.sort(nums2);
    int i = 0;
    int j = 0;
    while (i < nums1.length && j < nums2.length) {
      if (nums1[i] < nums2[j]) {
        i++;
      } else if (nums1[i] == nums2[j] && !list.contains(nums1[i])) {
        list.add(nums1[i]);
        i++;
        j++;
      } else {
        j++;
      }
    }
    int[] arr = new int[list.size()];
    for(int k = 0; k < list.size(); k++){
      arr[k] = list.get(k);
    }

    return arr;
  }

}
