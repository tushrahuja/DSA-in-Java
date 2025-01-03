public class LeetcodeNo69 {
  public static void main(String[] args) {
    int x = 8;
    System.out.println(mySqrt(x));
  }


  static int mySqrt(int x) {
      for (long i = 1; i <= x; i++) {
        if(i*i==x){
          return (int)i;
        }
        else if(i*i > x){
            return (int)i-1;
        }
      }
    
      return 0;
  }
}
