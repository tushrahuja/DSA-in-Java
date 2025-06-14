import java.util.Scanner;

public class ArmstrongNumber {
  public static void main(String[] args) {
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int newNum = n;
		int sum = 0;
		int length = (int) (Math.log10(newNum)+1);
		while(n > 0) {
			int last = n % 10;
			int cube = (int) Math.pow(last, length);
			sum += cube;
			n = n / 10;
		}
		System.out.println(sum == newNum);
	}
}
