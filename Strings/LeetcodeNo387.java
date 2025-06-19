public class LeetcodeNo387 {
  public static void main(String[] args) {
    String s = "leetcode";
    System.out.println(firstUniqChar(s));
  }
  static int firstUniqChar(String s) {
        char[] ch = s.toCharArray();
  
        for (int i = 0; i < ch.length; i++) {
            boolean isMatch = false;
            for (int j = 0; j < ch.length; j++) {
               if(i != j && ch[i]==ch[j]){
                isMatch = true;
                break;
               }
            }
            if(!isMatch){
                return i;
            }
        }
        return -1;
    }
}