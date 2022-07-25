package view;

public class Ex05LongestCommonSubstring {
	public static void main(String[] args) {
		String str1 = "ABFBBCKAS";
		String str2 = "ABCEDCBBCK";
		System.out.println(longestCommonSubstring(str1, str2));
		
	}
	private static String longestCommonSubstring(String str1, String str2) {
		String result = "";
		for (int i = 0; i < str1.length(); i++) {
			for (int j = i; j < str1.length(); j++) {
				String sub = str1.substring(i,j);
				if (!str2.contains(sub)) {
					break;
				}
				if (result.length() < sub.length()) {
					result = sub;
				}
			}
		}
		return result;
	}
}
