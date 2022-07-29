package view;

import java.util.Arrays;

public class Ex01Fixed {
	public static void main(String[] args) {
		int[] arr = {7, 8, 8, 8, 6, 2, 5, 2, 1, 10, 9};
		int[] shortenedArray = removeDuplicate(arr);
		System.out.println(Arrays.toString(shortenedArray));
		Arrays.sort(shortenedArray);
		if (shortenedArray.length < 3) {
			System.out.println("There is no third largest number");
			
		}else {
			System.out.println(shortenedArray[shortenedArray.length-3]);
		}
	}
	private static int[] removeDuplicate(int[] arr) {
		int index = 0;
		int[] result = new int[arr.length];
		boolean[] isDuplicates = new boolean[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (!isDuplicates[i]) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[j] == arr[i]) {
						isDuplicates[j] = true;
					}
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (!isDuplicates[i]) {
				result[index++] = arr[i];
			}
		}
		return Arrays.copyOf(result, index);
	}
}
