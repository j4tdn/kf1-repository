package view;

import java.util.Arrays;

public class Ex02ThrowThrows {
	public static void main(String[] args) {
	String s = "abc1234ooo";
	
	try {
		String result = getValidNumberAsString(s);
		System.out.println("result: " +result);
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(" Exception -->" +e.getMessage());
	}
	
	
}
	private static String getValidNumberAsString (String s) {
		if ( s == null) {
			throw new NullPointerException("String can not be Null");
		}
		
		String[] numbers = s.split("[a-z]+");
		return joinWithoutEmptySpace(numbers, ",");
	}
	
	private static String joinWithoutEmptySpace (String[] elements, String delimiter) {
		String[] newElements = new String[elements.length];
		int count = 0;
		for (String element: elements) {
			if(!"".equals(element)) {
				newElements[count++] = element;
			}
		}
		return String.join(delimiter, Arrays.copyOfRange(newElements, 0, count));
	}
	
	
}
