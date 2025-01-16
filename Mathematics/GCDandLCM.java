
import static java.lang.Integer.min;

public class GCDandLCM {
  public static void main(String[] args) {
    int n1 = 20, n2 = 40;

    for (int i = min(n2, n2); i >= 1; i--) {
      if (n1 % i == 0 && n2 % i == 0) {
        System.out.println("GCD is "+i);
        break;
      }
    }
    for (int j = 1; j < min(n1, n2); j++) {
      if (n1 % j == 0 && n2 % j == 0) {
        System.out.println("LCM is "+j);
        break;
      }
    }
  }
}