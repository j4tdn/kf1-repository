package view;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		int[] arr = {7, 8, 8, 8, 6, 2, 5, 2, 1, 3};
		//bubbleSort(arr);
		//selectionSort(arr);
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(mergeSort(arr)));
	}
	private static void bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					ArrayUtils.swap(arr, j, j + 1);
				}
			}
		}
	}
	private static void selectionSort(int[] arr) {
		int min;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			min = arr[i];
			for (int j = i; j < n; j++) {
				if (arr[j] < min) {
					min = arr[j];
				}
			}
			for (int j = i; j < n; j++) {
				if (arr[j] == min) {
					ArrayUtils.swap(arr, i, j);
					break;
				}
			}
		}
	}
	private static void insertionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1;i++) {
			if (arr[i] > arr[i + 1])
				for (int j = i + 1; j > 0; j--) {
					if (arr[j] < arr[j - 1])
						ArrayUtils.swap(arr, j, j - 1);
				}
		}
	}
	private static int[] mergeSort(int[] arr) {
		int n = arr.length;
		if (n == 1) return arr;
		if (n == 2) {
			if (arr[0] > arr[1]) {
				ArrayUtils.swap(arr, 0, 1);
			}
			return arr;
		}
		int middle = n / 2;
		int[] leftArray = Arrays.copyOfRange(arr, 0, middle);
		int[] rightArray = Arrays.copyOfRange(arr, middle, n);
		
		leftArray=mergeSort(leftArray);
		rightArray=mergeSort(rightArray);
		int[] result = new int[n];
		System.arraycopy(leftArray, 0, result, 0, leftArray.length);
		System.arraycopy(rightArray, 0, result, middle, rightArray.length);
		
		return result;
	}
	
}
