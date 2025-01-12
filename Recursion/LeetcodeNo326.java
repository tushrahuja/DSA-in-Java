public class LeetcodeNo326 {
  public static void main(String[] args) {
    int n = 27;
    System.out.println(isPowerOfThree(n));
  }

  static boolean isPowerOfThree(int n) {
    if (n <= 0) {
        return false;
    }
    int num = 0;
    while (true) {
        double pow = Math.pow(3, num);
        if (pow == n) {
            return true;
        }
        if (pow > n) {
            return false;
        }
        num++;
    }
}
}
