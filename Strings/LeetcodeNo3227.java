public class LeetcodeNo3227 {
  public static void main(String[] args) {
    String s = "leetcoder";
    System.out.println(doesAliceWin(s));
  }
  static boolean doesAliceWin(String s) {
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if("AEIOUaeiou".indexOf(c) != -1){
                return true;
            }
        }
        return false;
    }
}
