package view;

public class Ex01TextProcessing {
	public static void main(String[] args) {
		String str = "Welcome to  class";
		char[] charArray = str.toCharArray();
		String[] words = str.split("\\s+");
		for (int i = 0; i < str.length(); i++) {
			if (charArray[i] != ' ') {
				System.out.println(charArray[i]);
			}
		}
		System.out.println("=================================");
		for (String word : words) {
			System.out.println(word);
		}
		System.out.println("=================================");
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(charArray[i]);
		}
		System.out.println("\n=================================");
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.println(words[i]);
		}
	}

}
