import java.util.Arrays;

public class LeetcodeNo242 {
  public static void main(String[] args) {
    String s = "anagram";
    String t = "nagaram";
    System.out.println(isAnagram(s, t));
  }

  static boolean isAnagram(String s, String t) {
    char[] ch1 = s.toCharArray();
    char[] ch2 = t.toCharArray();
    Arrays.sort(ch1);
    Arrays.sort(ch2);
    if(ch1.length != ch2.length){
      return false;
    }
    for (int i = 0; i < ch1.length; i++) { 
      if(ch1[i] != ch2[i]){
        return false;
      }
    }
    return true;
  }
}
