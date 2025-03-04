
import java.util.Arrays;

public class LeetcodeNo73 {
  public static void main(String[] args) {
    int[][] arr = {{1,1,1}
                  ,{1,0,1}
                  ,{1,1,1}};
                  setZeroes(arr);
    System.out.println(Arrays.deepToString(arr));
  }
  static void setZeroes(int[][] matrix) {
    int[] col = new int[matrix[0].length];
    int[] row = new int[matrix.length];
    for(int i = 0; i < row.length; i++){
      for(int j = 0; j < col.length; j++){
        if(matrix[i][j] == 0){
          row[i] = 1;
          col[j] = 1;
        }
      }
    }
    for(int i = 0; i < row.length; i++){
      for(int j = 0; j < col.length; j++){
        if(row[i] == 1 || col[j]==1){
          matrix[i][j] = 0;
        }
      }
    }
}
}
