package view;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] arr = {7, 8, 8, 8, 6, 2, 5, 2, 1};
		System.out.println(Arrays.toString(removeDuplicate(arr)));
		int middle = arr.length / 2;
		double firstHalfAverage = findSum(arr, 0, middle);
		double secondHalfAverage = findSum(arr, middle + 1, arr.length);
		System.out.println(firstHalfAverage-secondHalfAverage);
		int thirdLargest = findThirdLargest(arr);
		if(thirdLargest == Integer.MAX_VALUE) {
			System.out.println("There are no third largest number");
		}else {
			System.out.println(thirdLargest);
		}
		
	}
	// 1 2 3 1 1 2 4
	// f f f f f f f
	private static int[] removeDuplicate(int[] arr) {
		int index = 0;
		int[] result = new int[arr.length];
		boolean[] isDuplicates = new boolean[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (!isDuplicates[i]) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[j] == arr[i]) {
						isDuplicates[i] = true;
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
	private static double findSum(int[] arr, int start, int end) {
		double total = 0;
		for (int i = start; i < end; i++) {
			total += arr[i];
		}
		return total;
	}
	private static int findThirdLargest(int[] arr) {
		Arrays.sort(arr);
		int largest = arr[arr.length-1];
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] < largest) {
				for (int j = i; j >= 0 ;j--) {
					if (arr[j] < arr[i]) return arr[j];
				}
			}
		}
		return Integer.MAX_VALUE;
	}
}
