import java.util.ArrayList;
import java.util.Arrays;

public class UnionOfTwoSortedArrays {
  public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 6, 8};
        int[] arr2 = {2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(uni(arr1, arr2)));
    }
    
    static int[] uni(int[] arr1, int[] arr2){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr1.length; i++){
           if(!list.contains(arr1[i])){
               list.add(arr1[i]);
           } 
        }
        for(int j = 0; j < arr2.length; j++){
            if(!list.contains(arr2[j])){
               list.add(arr2[j]);
           }
        }
      
        int[] arr3 = list.stream().mapToInt(i -> i).toArray();
        Arrays.sort(arr3);
        return arr3;
    }
}
