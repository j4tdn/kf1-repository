package homework;

public class Ex02 {
	public static void main(String[] args) {
		int[] numbers = {4,7,12,18};
		long sum = 0;
		for (int number:numbers)
			sum += factorial(number);
		System.out.println(sum);
	}
	private static long factorial(int n) {
		if (n == 0 || n == 1)
			return 1;
		else return n * factorial(n - 1);
	}
}
