package view;

public class Ex07 {
	public static void main(String[] args) {
		System.out.println(longestCharacterSequence("aaabaaabbaaaaadddddddffddddd"));
		
	}
	private static String longestCharacterSequence(String str) {
		String result = "";
		String counter = "" + str.charAt(0);
		for (int i = 1; i < str.length(); i++) {
			String letter = str.charAt(i) + "";
			if (counter.contains(letter)) {
				counter += letter;
				result = compareLength(result, counter);
			}else {
				result = compareLength(result, counter);
				counter = letter;
			}
		}
		return result;
	}
	private static String compareLength(String str1, String str2) {
		return (str1.length() >= str2.length()) ? (str1): (str2);

	}
}
