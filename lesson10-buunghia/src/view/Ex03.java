package view;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Ex03 {
	public static void main(String[] args) {
		String[] array = {"2", "-6", "10", null, "4", "8", null, "Special", "a", "c", "b", "xx"};
		sortArray(array);
		System.out.println(Arrays.toString(array));
	}
	private static int compareValueOf(String a) {
		if (a == null) return 4;
		if (a.equalsIgnoreCase("Special")) return 0;
		if (Pattern.matches("^-\\d+", a)) return 1;
		if (Pattern.matches("\\d+", a)) return 2; 
		return 3;
	}
	private static int compare(String a, String b) {
		int x = compareValueOf(a);
		int y = compareValueOf(b);
		if (x != y) return x - y;
		if (x == 0 || x == 4) return 0;
		if (x == 3) return a.compareTo(b);
		return Integer.parseInt(a)-Integer.parseInt(b);
		
	}
	public static void sortArray(String[] arr) {
		int n = arr.length;
		for (int i = 0; i < n -1; i++) {
			for (int j = 0; j < n - 1 - i; j++)
				if (compare(arr[j], arr[j+1]) > 0)
					ArrayUtils.swap(arr, j, j+1);
		}
	}
}
