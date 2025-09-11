import java.util.Arrays;

public class LeetcodeNo2785 {
  public static void main(String[] args) {
    String s = "lEetcOde";
    System.out.println(sortVowels(s));
  }
  static String sortVowels(String s) {
        char[] vowels = new char[s.length()];
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ("AEIOUaeiou".indexOf(c) != -1) {
                vowels[n] = c;
                n++;
            }
        }
        Arrays.sort(vowels, 0, n);
        char[] result = s.toCharArray();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ("AEIOUaeiou".indexOf(c) != -1) {
                result[i] = vowels[count];
                count++;
            }
        }
        return new String(result);
    }
}
