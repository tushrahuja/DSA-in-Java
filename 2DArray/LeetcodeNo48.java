
import java.util.Arrays;

public class LeetcodeNo48 {
  public static void main(String[] args) {
    int[][] arr = {{1,2,3}
                  ,{4,5,6}
                  ,{7,8,9}};
    rotate(arr);
    System.out.println(Arrays.deepToString(arr));
  }
  static void rotate(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = i; j < matrix[0].length; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }
    for(int i = 0; i < matrix.length; i++){
      int start = 0;
      int end = matrix[i].length - 1;
      while(start <= end){
        int temp = matrix[i][start];
        matrix[i][start] = matrix[i][end];
        matrix[i][end] = temp;
        start++;
        end--;
      }
    }
  }
}
