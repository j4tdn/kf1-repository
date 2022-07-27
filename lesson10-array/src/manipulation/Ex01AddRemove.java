package manipulation;

import java.util.Arrays;

public class Ex01AddRemove {
	public static void main(String[] args) {
		int[] numbers = { 1, 5, 2, 8, 10}; // H1
		setValue(numbers, 0, 99);
		
		int digit = 10; // S1 = 10
		setValue(digit);
		
		System.out.println(digit);
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(addValue(numbers,1,7)));
	}
	private static void setValue(int[] numbers, int index, int newValue) {
		numbers[index] = newValue;
	}
	// JAVA : pass by value at stack
	private static void setValue (int digit) {
		// S2 = 
		digit = 100;
	}
	private static int[] addValue(int[] numbers, int index, int newValue) {
		int[] newArray = new int[numbers.length+1];
		
		for (int i =0; i < newArray.length; i++) {
			if (i < index) {
				newArray[i] = numbers[i];
			}
			if (i == index) {
				newArray[i] = newValue;
			}
			if (i > index) {
				newArray[i] = numbers[i-1];
			}
		}
		return newArray;
	}
}
