public class LeetcodeNo202 {
  public static void main(String[] args) {
    System.out.println(isHappy(19));  // Example test case
  }
  static boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do{
            slow = square(slow);
            fast = square(square(fast));
        }
        while(slow != fast);
        if(slow == 1){
            return true;
        }
        return false;
    }

    static int square(int n){
        int num = 0;
        while(n > 0){
            int last = n % 10;
            num += last*last;
            n /= 10;
        }
        return num;
    }
}
