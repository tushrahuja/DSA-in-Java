public class Palindrome {
  public static void main(String[] args) {
    int x = 14241;
    System.out.println(isPalindrome(x));
  }

  static boolean isPalindrome(int x) {
    while(x < 0){
      return false;
    }
    int val = x;
    int sum = 0; 

    while(x > 0){
      int digit = x % 10;
      sum = sum * 10 + digit;
      x = x / 10;
    }
      return sum == val;
    
  }
}
