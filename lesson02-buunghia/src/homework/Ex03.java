package homework;

public class Ex03 {
	public static void main(String[] args) {
		int[] numbers = {2,33,100,373};
		for (int number : numbers) {
			System.out.println(isPalindrome(number));
		}
	}
	private static boolean isPalindrome(int n) {
		return n == reverse(n);
	}
	private static int reverse(int n) {
		int a = 0;
		while (n > 0) {
			a = a * 10 + n % 10;
			n /= 10;
		}
		return a;
	}
}
