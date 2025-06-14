import java.util.Scanner;

public class PalindromeNumber {
  public static void main(String[] args) {
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		palindrome(n);
	}
	
	static void palindrome(int number) {
		int copy = number;
		int reverse = 0;
		while(number > 0) {
			int lastDigit = number % 10;
			reverse = lastDigit + reverse * 10;
			number = number / 10;
		}
		if(reverse == copy) {
			System.out.println("Is a Palindrome");
	} else {
		System.out.println("Not a Palindrome");
	}
	}
}
