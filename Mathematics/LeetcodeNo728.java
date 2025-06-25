import java.util.*;

public class LeetcodeNo728 {
  public static void main(String[] args) {
    System.out.println(selfDividingNumbers(1, 22));
  }

  /*
   * static List<Integer> selfDividingNumbers(int left, int right) { //! BruteForce(I know it sucks)
   * ArrayList<Integer> list2 = new ArrayList<>();
   * for (int i = left; i <= right; i++) {
   * ArrayList<Integer> list = digits(i);
   * boolean isDivisible = true;
   * for (int j = 0; j < list.size(); j++) {
   * if (list.get(j) == 0 || i % list.get(j) != 0) {
   * isDivisible = false;
   * break;
   * }
   * }
   * if (isDivisible) {
   * list2.add(i);
   * }
   * }
   * return list2;
   * }
   * 
   * static ArrayList<Integer> digits(int num) {
   * ArrayList<Integer> list = new ArrayList<>();
   * while (num > 0) {
   * list.add(num % 10);
   * num = num / 10;
   * }
   * return list;
   * }
   */
  static List<Integer> selfDividingNumbers(int left, int right) { // Optimized
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = left; i <= right; i++) {
      if (isSelfDividing(i)) {
        list.add(i);
      }
    }
    return list;
  }

  static boolean isSelfDividing(int num) {
    int original = num;
    while (num > 0) {
      int digit = num % 10;
      if (digit == 0 || original % digit != 0) {
        return false;
      }
      num /= 10;
    }
    return true;
  }
}
