import java.util.*;

public class RemoveDuplicates {
  public static void main(String[] args) {
    int[] arr = { 0, 0, 1, 3, 5, 8, 8, 9, 10 };

    //! Print the array after removing duplicates
    System.out.println(Arrays.toString(dupli(arr)));
  }

  //! Method to remove duplicates from a sorted array
  static int[] dupli(int[] arr) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(arr[0]);

    for (int i = 1; i < arr.length; i++) {
      //! Check if the current element is different from the previous one
      if (arr[i] != arr[i - 1]) {
        list.add(arr[i]);
      }
    }

    //! Convert the list back to an array and return it
    int[] newArr = new int[list.size()];
    for (int i = 0; i < list.size(); i++) {
      newArr[i] = list.get(i);
    }

    return newArr;
  }
}
