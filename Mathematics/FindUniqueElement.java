
public class FindUniqueElement {
  public static void main(String[] args) {
    int[] arr = { 2, 3, 3, 2, 6, 6, 7};
    System.out.println(uniqueElem(arr));
  }

  static int uniqueElem(int[] arr) {
    int unique = 0;
    for (int n : arr) {
      unique ^= n;
    }
    return unique;
  }
}
