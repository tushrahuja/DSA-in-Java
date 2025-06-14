public class CountVowelsAndConsonants {
  public static void main(String[] args) {
		String str1 = "Beginning of Era and end as well";
		int countV = 0;
		int countC = 0;
		String str2 = str1.replaceAll(" ", "");
		for(int i = 0; i < str2.length(); i++) {
			char ch = str2.charAt(i);
			if(ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' ||ch == 'I' ||ch == 'O' || ch == 'U') {
				countV++;
			}
			else {
				countC++;
			}
		}
		System.out.println("Number of Vowels: "+ countV + " and Number of Consonants: " + countC);
	}
}
