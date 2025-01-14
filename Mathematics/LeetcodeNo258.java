public class LeetcodeNo258 {
  public static void main(String[] args) {
    int num = 38;
    System.out.println(addDigits(num));
  }

  static int addDigits(int num) {
    int sum = 0;
    while(num > 0) {
      int end = num % 10;
      sum += end;
      num = num / 10;
    }
    return sum >= 10 ? addDigits(sum) : sum;
  }
}
