public class LeetcodeNo1957{
  public static void main(String[] args) {
    String s = "leeetcode";
    String result = makeFancyString(s);
    System.out.println(result);
  }
  static String makeFancyString(String s) { //!BruteForce
        StringBuilder sb = new StringBuilder();
        int count = 1;
        sb.append(s.charAt(0));
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
            } else {
                count=1;
            }
            if(count<3){
                sb.append(s.charAt(i));
            }
        }
        String result = sb.toString();
        return result;
    }
}