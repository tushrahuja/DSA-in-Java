

public class LeetcodeNo1323{
  public static void main(String[] args) {
    System.out.println(maximum69Number(9669));  // Output: 9969
    System.out.println(maximum69Number(9996));  // Output: 9999
    System.out.println(maximum69Number(9999));  // Output: 9999
    System.out.println(maximum69Number(6666));  // Output: 9666
    System.out.println(maximum69Number(6969));  // Output: 9969
  }
/*  static int maximum69Number (int num) { //! Brute Force Approach
        boolean isDone = false;
        ArrayList<Integer> list = digits(num);
        int number = 0;
        int i = 0;
        while(!isDone && i < list.size()){
            int n = list.get(i);
            if(n==6){
                list.set(i, 9);
                isDone = true;
            }
            else i++;
        }
        for (int digit : list) {
            number = number * 10 + digit;
        }
        return number;
    }
    static ArrayList<Integer> digits(int num){
        ArrayList<Integer> list = new ArrayList<>();
        while(num > 0){
            int last = num % 10;
            list.add(last);
            num = num / 10;
        }
        Collections.reverse(list);
        return list;
    } */
  static int maximum69Number (int num) { //! Optimal Approach
    String str = Integer.toString(num);
    char[] chars = str.toCharArray();
    for (int i = 0; i < chars.length; i++) {
        if (chars[i] == '6') {
            chars[i] = '9';
            break;
        }
    }
    return Integer.parseInt(new String(chars));
  }
}