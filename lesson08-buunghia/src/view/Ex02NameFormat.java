package view;

public class Ex02NameFormat {
	public static void main(String[] args) {
		String str = "đẶnG nGỌC nghĩA ";
		printName(str);
		
	}

	private static void printName(String str) {
		String[] words = str.split("\\s+");
		for (String word: words) {
			String formattedWord = (""+word.charAt(0)).toUpperCase() + word.substring(1).toLowerCase();
			System.out.println(formattedWord);
		}
		
		
	}
}
