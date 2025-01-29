public class PalindromeNumber {
  public static void main(String[] args) {
    int number = 11211;
    System.out.println(isPalindrome(number));
  }
  static int result = 0;
  static boolean isPalindrome(int number) {
    return number == reverse(number);
  }

  static int reverse(int x) {
    if(x < 10){
      return result * 10 + x;
    }
    result = result * 10 + (x % 10);
    return reverse(x/10);
  }
}
