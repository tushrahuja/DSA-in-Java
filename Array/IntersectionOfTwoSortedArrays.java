import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoSortedArrays {
  public static void main(String[] args) {
       int[] a = {1, 2, 2, 3, 4, 5, 6};
       int[] b = {2, 3, 3, 5, 6, 7};
       System.out.println(intersect(a, b));
    }
    
    static List<Integer> intersect(int[] a, int[] b){
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i < a.length && j < b.length){
            if(a[i] < b[j]){
                i++;
            }
            else if(a[i] == b[j]){
                list.add(a[i]);
                i++;
                j++;
            }
            else{
              j++;
            }
        }
                
        return list;
    }
}
