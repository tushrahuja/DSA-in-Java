public class LeetcodeNo191 {
  public static void main(String[] args) {
    int n = 11; // Example input
    int result = hammingWeight(n);
    System.out.println("Hamming Weight of " + n + " is: " + result);
  }
  static int hammingWeight(int n) {
       int count = 0;
       String binaryNumber = Integer.toBinaryString(n);
       for(int i = 0; i < binaryNumber.length(); i++){
        if(binaryNumber.charAt(i)=='1'){
            count++;
        }
       } 
       return count;
    }
}
