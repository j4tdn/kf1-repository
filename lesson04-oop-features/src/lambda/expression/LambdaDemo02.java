package lambda.expression;

import java.util.Arrays;

public class LambdaDemo02 {
	public static void main(String[] args) {
		int[] numbers = { 1, 10, 0, 20, 7, 15 };
		// anonymous class <==> anonymous function(lambda expression)
		// use to create, initial instance-object from interface
		Strategy evenCondition = new Strategy() {
			@Override
			public boolean isMatch(int element) {
				return element % 2 == 0;
			}
		};
		printf(findElements(numbers, evenCondition));

		Strategy oddCondition = new Strategy() {

			@Override
			public boolean isMatch(int element) {
				return element % 2 != 0;
			}
		};
		printf(findElements(numbers, oddCondition));
	}

	// Condition: class, interface
	private static int[] findElements(int[] numbers, Strategy condition) {
		int[] result = new int[numbers.length];
		int count = 0;
		for (int number : numbers) {
			if (condition.isMatch(number)) {
				result[count] = number;
				count++;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

	private static void printf(int[] numbers) {
		for (int number : numbers) {
			System.out.print(number + " ");
		}
		System.out.println();
	}

	// number % 2 == 0 ==> isEven(number)
	// number % 5 == 0 ==> isPowerOf(number)
	// isPrime(number)
	// input: int
	// output: boolean
}
