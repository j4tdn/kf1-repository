package utils;

public class SortUtils {
	private SortUtils(){}
	public static void swap (int[] source, int i, int j) {
		int temp = source[i];
		source[i] = source[j];
		source[j] = temp;
	}
	
}
