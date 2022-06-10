package lambda.expression;

import java.util.Arrays;

/**
 * Đầu vào: Cho một dãy số nguyên ngẫu nhiên nhỏ hơn N 
 * 1. Tìm những phần tử là bội của 5 
 * 2. Tìm những phần tữ chẵn 
 * 3. Tìm những phần tử là số nguyên tố
 * .......
 */

public class LambdaDemo {
	public static void main(String[] args) {
		int[] numbers = { 1, 10, 0, 20, 7, 15 };
		printf(findElementsCof5(numbers));
		printf(findEvenElements(numbers));
		printf(findPrimeElements(numbers));

		int a = 10;
		isGreater(a, 5);
		isGreater(a, 7);
	}

	private static boolean isGreater(int a, int element) {
		return a > element;
	}

	private static boolean isGreaterThan5(int a) {
		return a > 5;
	}

	private static boolean isGreaterThan7(int a) {
		return a > 7;
	}

	private static int[] findElementsCof5(int[] numbers) {
		int[] result = new int[numbers.length];
		int count = 0;
		for (int number : numbers) {
			if (number % 5 == 0) {
				result[count] = number;
				count++;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

	private static int[] findEvenElements(int[] numbers) {
		int[] result = new int[numbers.length];
		int count = 0;
		for (int number : numbers) {
			if (number % 2 == 0) {
				result[count] = number;
				count++;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

	private static int[] findPrimeElements(int[] numbers) {
		int[] result = new int[numbers.length];
		int count = 0;
		for (int number : numbers) {
			if (isPrime(number)) {
				result[count] = number;
				count++;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

	private static boolean isPrime(int number) {
		if (number == 0 || number == 1)
			return false;

		for (int runner = 2; runner <= Math.sqrt(number); runner++) {
			if (number % runner == 0) {
				return false;
			}
		}
		return true;
	}

	private static void printf(int[] numbers) {
		for (int number : numbers) {
			System.out.print(number + " ");
		}
		System.out.println();
	}
}
