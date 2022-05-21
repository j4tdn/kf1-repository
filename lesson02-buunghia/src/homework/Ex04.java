package homework;

public class Ex04 {
	public static void main(String[] args) {
		int[] numbers = {5,2,4,1,6,8};
		int max = 0;
		for (int number : numbers)
			if (number % 2 == 1 && number > max)
				max = number;
		if (max == 0) System.out.print("There are no odd number.");
			else System.out.print(max+" is the largest odd number");
	}
}
