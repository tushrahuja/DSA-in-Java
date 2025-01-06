
public class LeetcodeNo13 {
  public static void main(String[] args) {
    String s = "MCMXCIV";
    System.out.println(romanToInt(s));
  }

  static int romanToInt(String s) { 
    int num = 0;
    for (int i = 0; i < s.length(); i++) { 
      if (i > 0 && value(s.charAt(i)) > value(s.charAt(i - 1))) { 
        num += value(s.charAt(i)) - 2 * value(s.charAt(i - 1)); 
      } 
      else{ 
        num += value(s.charAt(i)); 
      } 
    } 
    return num;
  }

  static int value(char r) { 
      return switch (r) {
          case 'I' -> 1;
          case 'V' -> 5;
          case 'X' -> 10;
          case 'L' -> 50;
          case 'C' -> 100;
          case 'D' -> 500;
          case 'M' -> 1000;
          default -> 0;
      };
  }
}
