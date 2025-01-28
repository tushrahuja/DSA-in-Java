public class PalindromeNumber {
  public static void main(String[] args) {
    int number = 11231;
    System.out.println(isPalindrome(number, number, 0));
  }

  static boolean isPalindrome(int original, int number, int result) {
    if (number == 0) {
      return original == result;
    }
    
    result = result * 10 + (number % 10);
    return isPalindrome(original, number / 10, result);
  }
}
