import java.util.Arrays;

public class LeetcodeNo66 {
  public static void main(String[] args) {
    int[] digits = { 1, 8, 8 };
    System.out.println(Arrays.toString(plusOne(digits)));

  }

  static int[] plusOne(int[] digits) {
    for (int i = digits.length - 1; i >= 0; i--) {
      if (digits[i] < 9) {
        digits[i]++;
        return digits;
      }
      digits[i] = 0;
    }

    int[] newDigits = new int[digits.length + 1];
    newDigits[0] = 1;
    return newDigits;
  }

  
}
