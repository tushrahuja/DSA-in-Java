public class ReplaceCharWithAsterisk{
  public static void main(String[] args){
    String str = "Tushar Ahuja 123";
    String result = replace(str);
    System.out.println(result);
  }

  public static String replace(String str){
    char[] arr = new char[str.length()];
		for(int i = 0; i < str.length(); i++) {
			arr[i] = '*';
		}

		return new String(arr);
	}
}