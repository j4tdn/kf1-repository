package view;

import java.util.Arrays;

public class Ex02ThrowThrows {
	public static void main(String[] args) {
		String s = "abc12h7qua";

		try {
			String result = getValidNumbersAsString(s);
			System.out.println("result: " + result);
		} catch (Exception e) {
			System.out.println("Exception --> " + e.getMessage());
		}
		System.out.println(">>>>> Finished");
	}

	private static String getValidNumbersAsString(String s) {
		if (s == null) {
			throw new NullPointerException("String cannot be NULL !");

		}
		String[] numbers = s.split("[a-z]+");
		return joinWithoutEmptySpace(numbers, ",");

	}

	private static String joinWithoutEmptySpace(String[] elements, String delimiter) {
		String[] newElements = new String[elements.length];
		int count = 0;
		for (String element : elements) {
			if (!"".equals(element)) {
				newElements[count++] = element;
			}
		}

		return String.join(delimiter, Arrays.copyOfRange(newElements, 0, count));

	}

}
