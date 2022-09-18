package view;

import java.util.Arrays;

import utils.CompareIntHelper;
import utils.SortUtils;

public class Ex02BubbleSortWithInt {
	public static void main(String[] args) {
		int[] numbers = {1, 5, 11, 9, 4, 6};
		
		bubbleSort(numbers,(pre,next) -> pre > next);
		System.out.println(Arrays.toString(numbers));
	}
	private static void bubbleSort(int[] source,CompareIntHelper helper) {
		int len = source.length;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len - i - 1; j++) {
				if (helper.compare(source[j], source[j+1])) {
					SortUtils.swap(source, j, j+1);
				}
			}
		}
	}
	// dafault --> asc
	private static void bubbleSort(int[] source) {
		int len = source.length;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len - i - 1; j++) {
				if (source[j] > source[j+1]) {
					SortUtils.swap(source, j, j+1);
				}
			}
		}
	}
	private static void swap (int[] source, int a, int b) {
		int temp = source[a];
		source[a] = source[b];
		source[b] = temp;
	}
}
