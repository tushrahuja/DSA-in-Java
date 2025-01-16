import static java.lang.Integer.max;
import static java.lang.Integer.min;

public class GCDandLCM {
  public static void main(String[] args) {
    int n1 = 30, n2 = 120;

    for (int i = min(n2, n2); i >= 1; i--) {
      if (n1 % i == 0 && n2 % i == 0) {
        System.out.println("GCD is "+i);
        break;
      }
    }
    for (int j = max(n2, n2); j > 1; j--) {
      if (j % n1 == 0  && j % n2 == 0) {
        System.out.println("LCM is "+j);
        break;
      }
    }
  }
}