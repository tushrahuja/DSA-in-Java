import java.util.HashMap;
import java.util.Map;

public class LeetcodeNo3541{
  public static void main(String[] args) {
    String s = "successes";
    System.out.println(maxFreqSum(s));
  }
  static int maxFreqSum(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int countVowel = 0;
        int countConsonant = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char c = entry.getKey();
            int freq = entry.getValue();

            if ("aeiou".indexOf(c) != -1) {
                if (freq > countVowel) {
                    countVowel = freq;
                }
            } else { 
                if (freq > countConsonant) {
                    countConsonant = freq;
                }
            }
        }
        return countVowel + countConsonant;
    }
}