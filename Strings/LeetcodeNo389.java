
import java.util.Arrays;

public class LeetcodeNo389 {
  public static void main(String[] args) {
    String s = "abcd";
    String t = "abcde";
    System.out.println(findTheDifference(s, t));
  }

  static char findTheDifference(String s, String t) {
    char[] sch = s.toCharArray();
    char[] tch = t.toCharArray();
    Arrays.sort(tch);
    Arrays.sort(sch);
    for (int i = 0; i < tch.length - 1; i++) {
      if (sch[i] != tch[i]) {
        return tch[i];
      }
    }
    return tch[tch.length - 1];
  }
}
