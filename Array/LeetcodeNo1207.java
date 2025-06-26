import java.util.HashMap;
import java.util.HashSet;

public class LeetcodeNo1207 {
  public static void main(String[] args) {
    int[] arr = {1, 2, 2, 1, 1, 3};
    System.out.println(uniqueOccurrences(arr));
  }
/*  static boolean uniqueOccurrences(int[] arr) { //! BruteForce
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            int count = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[i]==arr[j]){
                    map.put(arr[i], ++count);
                }
            }
        }
        HashSet<Integer> set = new HashSet<>(map.values());
        return set.size()==map.size();
    }
*/ 
  static boolean uniqueOccurrences(int[] arr) { //! Optimized
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int num : arr) {
      map.put(num, map.getOrDefault(num, 0) + 1); // This line updates the count of 'num' in the map
    } // Count occurrences of each number
    HashSet<Integer> set = new HashSet<>(map.values()); // Create a set from the values of the map
    // If the size of the set is equal to the size of the map, it means all occurrences are unique
    return set.size() == map.size();
  }
}