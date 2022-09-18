package view;

import java.util.Arrays;
import static java.util.Comparator.*;
import java.util.function.Function;


public class Ex07ArraysSortWithString {
	public static void main(String[] args) {
		String[] sequences = {"a", "c", "b", "x", "z", "k"};
		
		// Array.sort(Object[] objects) --> auto ascending
		//require Object compatible with Comparable
		// require Object implement Comparable
		Arrays.sort(sequences);
		System.out.println("sorted sequences in ascending: " + Arrays.toString(sequences));
		
		Arrays.sort(sequences, (o1, o2) -> o2.compareTo(o1));
		System.out.println("sorted sequences in descending: " + Arrays.toString(sequences));
		
		sequences = new String[]{"a", "c", null, "b", "x", null, "z", "k"};
		Arrays.sort(sequences, nullsFirst(comparing(Function.identity(),reverseOrder())));
		System.out.println(Arrays.toString(sequences));
		
		
	}
}
