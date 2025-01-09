public class LeetcodeNo2185 {
  public static void main(String[] args) {
    String[] words = { "pay", "attention", "practice", "attend" };
    String pref = "at";
    System.out.println(prefixCount(words, pref));
  }

  static int prefixCount(String[] words, String pref) {
    int count = 0;
    for (String word : words) {
      if (word.indexOf(pref)==0) {
        count++;
      }
    }
    return count;
  }
}
