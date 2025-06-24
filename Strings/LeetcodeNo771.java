import java.util.HashSet;

public class LeetcodeNo771 {
  public static void main(String[] args) {
    String jewels = "aA";
    String stones = "aAAbbbb";
    System.out.println(numJewelsInStones(jewels, stones));
  }
  static int numJewelsInStones(String jewels, String stones) {
        HashSet<String> ht = new HashSet<>();
        int count =0;
        for(int i = 0; i < jewels.length(); i++){
            ht.add(String.valueOf(jewels.charAt(i)));
        }
        for(int i = 0; i < stones.length(); i++){
            if(ht.contains(String.valueOf(stones.charAt(i)))){
                count++;
            }
        }
        return count;
    }
}
