package homework;

import java.util.Arrays;
import java.util.OptionalInt;

public class Ex04 {
	public static void main(String[] args) {
		int[] numbers = {2,4,6};
		OptionalInt opt = Arrays.stream(numbers)
			  .filter(number -> number % 2 != 0)
			  .max();
		if (opt.isPresent()) {
			System.out.println("max2: "+opt.getAsInt());
		}
		/*int max = 0;
		for (int number : numbers)
			if (number % 2 == 1 && number > max)
				max = number;
		if (max == 0) System.out.print("There are no odd number.");
			else System.out.print(max+" is the largest odd number");*/
	}
}
