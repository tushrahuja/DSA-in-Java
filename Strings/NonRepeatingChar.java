public class NonRepeatingChar {
  public static void main(String[] args) {
    String s = "geeksforgeeks";
    System.out.println("The first non-repeating character is: " + nonRepeatingChar(s));
  }

  static char nonRepeatingChar(String s) {
    boolean isMatched;
    char[] ch = s.toCharArray();
    for (int i = 0; i < ch.length; i++) {
      isMatched = false;
      for (int j = 0; j < ch.length; j++) {
        if (i != j && ch[i] == ch[j]) {
          isMatched = true;
          break;
        }

      }
      if (!isMatched) {
        return ch[i];
      }
    }
    return '$';
  }
}
