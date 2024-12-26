public class LeetcodeNo1295 {
  public static void main(String[] args) {
    int[] arr = { 12, 345, 2, 6, 7896 };

    System.out.println(findNumbers(arr));
  }

  static int findNumbers(int[] arr) {
    int count = 0;
    for (int idx = 0; idx < arr.length; idx++) {
       if(even(arr[idx])){
        count++;
       }

    }
    return count;

  }

  static boolean even(int num) {
    int digit = digits(num);
      return digit % 2 == 0;
  }

  static int digits(int num) {
    int count = 0;
    while (num > 0) {
      num = num / 10;
      count++;
    }
    return count;
  }
}
