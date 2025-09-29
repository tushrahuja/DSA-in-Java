public class ReverseString {
  public static void main(String[] args) {
    String input = "Tushar";
    String reversed = reverseString(input);
    System.out.println("Original "+ input);
    System.out.println("Reversed: "+ reversed);
  }
  static String reverseString(String str){
      if(str.length() <= 1){
        return str;
      }
      return reverseString(str.substring(1)) + str.charAt(0);
  }
}
