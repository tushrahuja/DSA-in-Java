import java.util.ArrayList;
import java.util.List;

public class LeetcodeNo1431 {
  public static void main(String[] args) {
    int[] candies = { 2, 3, 5, 1, 3 };
    int extraCandies = 3;

    System.out.println(kidsWithCandies(candies, extraCandies));

  }

  static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    ArrayList<Boolean> list  = new ArrayList<>();

    int max = findMax(candies, extraCandies);
    for (int idx = 0; idx < candies.length; idx++) {
        int newCandies = candies[idx] + extraCandies;
        if(newCandies >= max){
          list.add(true);
        }
        else{
          list.add(false);
        }
    }
    return list;
  }

  static int findMax(int[] arr, int target) {
    

    int max = Integer.MIN_VALUE; 
    for (int index = 0; index < arr.length; index++) {
      if (arr[index] > max) {
        max = arr[index]; 
      }
    }
    return max;
  }
}
