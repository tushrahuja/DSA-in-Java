import java.util.Arrays;

public class LeetcodeNo1832 {
  public static void main(String[] args) {
    String sentence = "thequickbrownfoxjumpsoverthelazydog";
    System.out.println(checkIfPangram(sentence));
  }

  static boolean checkIfPangram(String sentence) {
    char[] ch = sentence.toCharArray();
    boolean isPangram = true;
    
    Arrays.sort(ch);
    for (char i = 'a'; i <= 'z'; i++) {
      boolean found = false;
      for (char elem : ch) {
        if (elem == i) {
          found = true;
          break;
        }
      }
      if (!found) { 
        isPangram = false;
        break;
      }
    }
    return isPangram;
  }
}
