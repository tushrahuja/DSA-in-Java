

public class LeetcodeNo1732 {
  public static void main(String[] args) {
    int[] gain = { -5, 1, 5, 0, -7 };
    System.out.println(largestAltitude(gain));
  }

  static int largestAltitude(int[] gain) {
    int highestAlt = 0;
    int alt = 0;
    for (int idx : gain) {
        alt = idx + alt;
        if(alt > highestAlt){
            highestAlt = alt;
        }
    }
    return highestAlt;
  }
}
