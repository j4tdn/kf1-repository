package ex01;

public class Main {
	public static void main(String[] args) {
		System.out.println(isPowerOf(8, 2));
		System.out.println(isPowerOf(2, 8));
		System.out.println(isPowerOf(2, 6));
		System.out.println(isPowerOf(20, 4));
		System.out.println(isPowerOf(5, 625));
	}
	private static boolean isPowerOf(int a, int b ) {
		if (a > b) return isPowerOf(b , a);
		while ( b >= a) {
			if (a == b) return true;
			if (b % a != 0) return false;
		    b /= a;
		}
		return false;
	}
}
