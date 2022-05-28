package lambda.expression;

import java.util.Arrays;

public class LambdaDemo03 {
	public static void main(String[] args) {
		int[] numbers = { 1, 10, 0, 20, 7, 15 };
		// anonymous class <==> anonymous function(lambda expression)
		// use to create, initial instance-object from interface
		// Strategy oddStrategy = (int element) -> {
			// return element % 2 != 0;
		// };
		
		printf(findElements(numbers, number -> number % 2 != 0));
		printf(findElements(numbers, number -> number % 2 == 0));
		printf(findElements(numbers, number -> {
			if (number == 0 || number == 1) return false;
			for (int runner = 2; runner <= Math.sqrt(number); runner++) {
				if (number % runner == 0) {
					return false;
				}
			}
			return true;
		}));
	}
	
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
	
}
