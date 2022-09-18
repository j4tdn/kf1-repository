package view;

import java.util.Arrays;

import utils.CompareStringHelper;
import utils.SortUtils;

public class Ex03BubbleSortWithString {
	public static void main(String[] args) {
		String[] sequences = {"Alex", "Terry", null, "Rivaldo", "Zed", null, "Boo"};
		bubbleSort(sequences,(s1, s2) -> {
			if (s1 == null) {
				return 1;
			}
			if (s2 == null) {
				return -1;
			}
			return s1.compareTo(s2);
		});
		System.out.println(Arrays.toString(sequences));
	}
	private static void bubbleSort(String[] source, CompareStringHelper helper) {
		for (int i = 0; i < source.length; i++) {
			for (int j = 0; j < source.length - i - 1; j++) {
				if (helper.compare(source[j], source[j+1]) > 0) {
					SortUtils.swap(source, j, j+1);
				}
			}
		}
	}
	private static void bubbleSort(String[] source) {
		for (int i = 0; i < source.length; i++) {
			for (int j = 0; j < source.length - i - 1; j++) {
				if (source[j].compareTo(source[j+1]) > 0) {
					SortUtils.swap(source, j, j+1);
				}
			}
		}
	}
}
