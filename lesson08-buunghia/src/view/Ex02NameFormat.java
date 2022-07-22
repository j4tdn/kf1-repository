package view;

public class Ex02NameFormat {
	public static void main(String[] args) {
		String str = "đẶnG nGỌC nghĩA ";
		String[] words = str.split("\\s+");
		for (String word : words) {
			printName(word + " ");
		}
	}

	private static void printName(String str) {
		char[] chars = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if (i == 0) {
				System.out.print(Character.toUpperCase(chars[i]));
			} else {
				System.out.print(Character.toLowerCase(chars[i]));
			}
		}
	}
}
