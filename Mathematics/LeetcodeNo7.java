public class LeetcodeNo7 {
  public static void main(String[] args) {
    int x = 123;
    System.out.println(reverse(x));
  }

  static int reverse(int x) {
    double result = 0;

    if (x > Integer.MAX_VALUE || x < Integer.MIN_VALUE)
      return 0;
    while (x != 0) {
      double end = x % 10;
      double newX = result * 10 + end;

      result = newX;
      x = x / 10;

    }
    return (int) result;
  }
}
