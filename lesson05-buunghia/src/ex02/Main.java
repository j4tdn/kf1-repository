package ex02;

public class Main {
	public static void main(String[] args) {
		System.out.println(isSpecialNumber(1));
		System.out.println(isSpecialNumber(2));
		System.out.println(isSpecialNumber(3));
		System.out.println(isSpecialNumber(6));
		System.out.println(isSpecialNumber(15));
	}
	private static boolean isSpecialNumber(int n) {
		int i = 1;
		while ( n >= i) {
			if (n == i) return true;
			n -= i;
			i ++;
		}
		return false;
	}
}
