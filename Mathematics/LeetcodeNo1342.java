public class LeetcodeNo1342 {
  public static void main(String[] args) {
    System.out.println(numberOfSteps(14));  // Output: 6
  }
  static int numberOfSteps(int num) { 
    int count = 0;
    while (num > 0) {
      if (num % 2 == 0) {
        num /= 2;
      } else {
        num -= 1;
      }
      count++;
    }
    return count;
  }

}
