package homework;

public class Ex01 {
	public static void main(String[] args) {
		int[] numbers = {2,4,5,8};
		for (int number : numbers) {
			System.out.println(isPowerOf(number, 2));
		}
	}
	private static boolean isPowerOf(int a,int b) {
		if ( b > a) return isPowerOf(b , a);
		while (a >= b) {
			if (a == b) return true;
			if (a % b != 0) return false;
			a /= b;
		}
		return false;
	}
}
