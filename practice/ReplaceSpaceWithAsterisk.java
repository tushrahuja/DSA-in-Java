public class ReplaceSpaceWithAsterisk {
  public static void main(String[] args) {
		String str = "Tushar Ahuja 123";
		String result = replace(str);
		System.out.println(result);
	}
	
	static String replace(String str) {
		String str1 = "";
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == ' ') {
				ch = '*';
			}
			str1 = str1 + ch;
		}
		return str1;
	}
}
