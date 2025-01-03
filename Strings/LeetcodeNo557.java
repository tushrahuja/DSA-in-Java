

public class LeetcodeNo557 {
  public static void main(String[] args) {
    String s = "Let's take LeetCode contest";
    
    System.out.println(reverseWords(s));
  }

  static String reverseWords(String s) {
    StringBuilder sb = new StringBuilder();
    String s1[] = s.split(" ");
    for (String str : s1) {
      StringBuilder temp = new StringBuilder(str);
      sb.append(temp.reverse().toString()).append(" ");
    }
    return sb.toString().trim();
  }
}
