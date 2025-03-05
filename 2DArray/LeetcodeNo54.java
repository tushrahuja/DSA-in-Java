
import java.util.*;

public class LeetcodeNo54 {
  public static void main(String[] args) {
    int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
    System.out.println(spiralOrder(arr));
  }

  static List<Integer> spiralOrder(int[][] matrix) {
    int col = matrix.length;
    int row = matrix[0].length;
    int left = 0, right = row - 1;
    int top = 0, bottom = col - 1;
    ArrayList<Integer> finalMatrix = new ArrayList<>();

    while (top <= bottom && left <= right) {
      for (int i = left; i <= right; i++) {
        finalMatrix.add(matrix[top][i]);
      }
      top++;
      for (int i = top; i <= bottom; i++) {
        finalMatrix.add(matrix[i][right]);
      }
      right--;
      if (top <= bottom) {
        for (int i = right; i >= left; i--) {
          finalMatrix.add(matrix[bottom][i]);
        }
        bottom--;
      }
      if (left <= right) {
        for (int i = bottom; i >= top; i--) {
          finalMatrix.add(matrix[i][left]);
        }
        left++;
      }
    }
    return finalMatrix;
  }
}
