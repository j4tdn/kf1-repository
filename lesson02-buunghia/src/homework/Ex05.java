package homework;

public class Ex05 {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		for (int number : numbers) {
			System.out.print(number+" convert to binary is: ");
			convertToBinary(number);
			System.out.println();
		}
	}
	private static void convertToBinary(int n) {
		if (n >= 2) convertToBinary(n / 2);
		System.out.print(n % 2);
	}
}
