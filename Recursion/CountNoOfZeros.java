public class CountNoOfZeros {
  public static void main(String[] args) {
    int number = 101;
    System.out.println(countZeros(number));
  }

  static int count = 0;
  static int countZeros(int num){
    if(num == 0){
      return 1;
    }
    if(num%10==0){
      count++;
      return countZeros(num/10);
    }
    return count;
  }
}
