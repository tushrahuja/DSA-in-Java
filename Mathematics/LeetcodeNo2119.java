public class LeetcodeNo2119 {
  public static void main(String[] args) {
    int num = 526;
    System.out.println(isSameAfterReversals(num));
  }

  static boolean isSameAfterReversals(int num) {
    if (num == 0) {
      return true;
    }
    return num % 10 != 0;
  }
}
