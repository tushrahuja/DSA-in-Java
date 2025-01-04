public class LeetcodeNo680 {
  public static void main(String[] args) {
    String s = "deeee";
    System.out.println(validPalindrome(s));
  }

  static boolean validPalindrome(String s) {
    if (s.length() == 0) {
      return true;
    }
    int start = 0;
    int end = s.length() - 1;
    for (int i = start; i <= end; i++) {
      if (s.charAt(start) == s.charAt(end)) {
        start++;
        end--;
      } else
        return possible(s, start + 1, end) || possible(s, start, end - 1);
    }
    return true;
  }

  static boolean possible(String s, int start, int end) {
    if (s.length() == 0) {
      return true;
    }
    for (int i = start; i <= end; i++) {
      if (s.charAt(start) == s.charAt(end)) {
        start++;
        end--;
      } else {
        return false;
      }
    }
    return true;
  }
}