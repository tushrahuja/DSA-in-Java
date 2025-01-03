public class LeetcodeNo709 {
  public static void main(String[] args) {
    String s = "Hello";
    System.out.println(toLowerCase(s));
    
  }

  static String toLowerCase(String s) {
    char[] ch = s.toCharArray();

    for (char i = 0; i < ch.length; i++) {
      if(ch[i] >= 65 && ch[i] <= 90){
        char re = ch[i];
        ch[i] = (char) (re + 32);
      }
      s = new String(ch);
    }
    return s;
  }
}

