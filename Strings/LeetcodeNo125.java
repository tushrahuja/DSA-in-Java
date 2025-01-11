
public class LeetcodeNo125 {
  public static void main(String[] args) {
    String str = " "; 
    System.out.println(isPalindrome(str));
  }

  static boolean isPalindrome(String str) {
    str = str.strip();
    str = str.toLowerCase();
    str = str.replaceAll("[^a-zA-Z0-9]", "");
    if(str.length() == 0){
      return true;
    }
    int start = 0;
    int end = str.length() - 1;
    boolean isP = false;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(start) != str.charAt(end)) {
        return false;
      } else if (str.charAt(start) == str.charAt(end)) {
        start++;
        end--;
        isP = true;
      }
    }
    return isP;
  }
}
