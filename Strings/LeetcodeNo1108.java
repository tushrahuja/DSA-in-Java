public class LeetcodeNo1108 {
  public static void main(String[] args) {
    String address = "1.1.1.1";
    System.out.println(defangIPaddr(address));
  }

  static String defangIPaddr(String address) {
    StringBuilder str = new StringBuilder();
    char arr[] = address.toCharArray();
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]=='.'){
          str.append("[.]");
        }
        else{
          str.append(arr[i]);
        }
    }
    return str.toString();
  }
}
