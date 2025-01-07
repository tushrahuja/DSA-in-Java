public class LeetcodeNo1961 {
  public static void main(String[] args) {
    String s = "iloveleetcode";
    String[] words = { "i", "love", "leetcode", "apples" };
    System.out.println(isPrefixString(s, words));

  }

  static boolean isPrefixString(String s, String[] words) {
    StringBuilder str = new StringBuilder();
    for (String word : words) {
      str.append(word);
      if (str.length() > s.length()) {
        return false;
      }
      if (str.toString().equals(s.substring(0, str.length()))) {
        if (str.length() == s.length()) {
          return true;
        }
      } else {
        return false;
      }
    }
    return false;
  }
}
