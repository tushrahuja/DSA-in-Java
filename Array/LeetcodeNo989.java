import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetcodeNo989 {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 0, 0 };
    int k = 34;

    System.out.println(addToArrayForm(arr, k));
  }

  static List<Integer> addToArrayForm(int[] num, int k) {
    ArrayList<Integer> ans = new ArrayList<>();
    for(int i = num.length - 1; i >= 0 || k > 0; i--){
      if(i>=0){
        ans.add((num[i]+k)%10);
        k = (num[i]+k)/10;
      }
      else{
        ans.add(k%10);
        k = k / 10;
      }
    }
    Collections.reverse(ans);
    return ans;
  }
}
