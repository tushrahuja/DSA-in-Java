public class ReverseNumber {
  static int result = 0;
  public static void main(String[] args) {
    int x = 1234;
    System.out.println(reverse(x));
  }

  static int reverse(int x) {
    if(x < 10){
      return result * 10 + x;
    }
    result = result * 10 + (x % 10);
    return reverse(x/10);
  }
}
