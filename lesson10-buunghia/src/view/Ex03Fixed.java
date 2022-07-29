package view;

import java.util.Arrays;
import java.util.Comparator;

public class Ex03Fixed {
	public static void main(String[] args) {
		Comparator<String> comparator = new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				if (o1 == null) return 1;
				if (o2 == null) return -1;
				if (o1.equals("Special")) return -1;
				if (o2.equals("Special")) return 1;
				if (o1.matches("\\d+") && o2.matches("\\d+")) {
					System.out.println("abc");
					return Integer.parseInt(o1) - Integer.parseInt(o2);
				}
				return o1.compareTo(o2);
			}
		};	String[] array = {"2", "6", "10", null, "4", "8", null, "Special", "a", "c", "b", "xx"};
		Arrays.sort(array, comparator);
		System.out.println(Arrays.toString(array));
		
	}
}
