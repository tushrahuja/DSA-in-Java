import java.util.HashSet;
import java.util.Set;

public class LeetcodeNo1935 {
  public static void main(String[] args) {
    String text = "hello world";
    String brokenLetters = "ad";
    System.out.println(canBeTypedWords(text, brokenLetters));
  }
  static int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> set = new HashSet<>();
        for (char c : brokenLetters.toCharArray()) {
            set.add(c);
        }

        String[] words = text.split(" ");
        int count = 0;

        for(String word: words){
            boolean canType = true;

            for(char c: word.toCharArray()){
                if(set.contains(c)){
                    canType = false;
                    break;
                }
            }

            if(canType){
                count++;
            }
        }
        
        return count;
    }
}