import java.util.HashMap;
import java.util.Map;

public class LeetcodeNo3005 {
  public static void main(String[] args) {
    int[] nums = {1,2,2,3,1,4};
    System.out.println(maxFrequencyElements(nums)); 
  }
  static int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int frequency = 0, count = 0;

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (int val : freq.values()) {
            if (val == frequency) {
                count++;
            } else if (val > frequency) {
                frequency = val;
                count = 1;
            }
        }

        return frequency * count;
    }
}