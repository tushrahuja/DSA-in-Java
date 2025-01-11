public class LeetcodeNo58 {
  public static void main(String[] args) {
    String s = "Hello World";
    System.out.println(lengthOfLastWord(s));
  }

  static int lengthOfLastWord(String s) {
    s = s.trim();
    String[] str = s.split(" ");
    return str[str.length -1].length();
  }
}
