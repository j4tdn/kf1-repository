package view;

public class Ex06 {
	public static void main(String[] args) {
		System.out.println(numberAt(69));
	}
	private static String numberAt(int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1 ; sb.length() < n; i++) {
			sb.append(i);
		}
		return String.valueOf(sb.charAt(n-1));
	}
}
