package view;

import java.util.Arrays;

public class Ex01 {
	//Bài 1(15đ): Cho dãy N (0 <= N < 100) phần tử. Mỗi phần tử N[i] (1 <= N[i] <= 20) là
	//một số nguyên. Yêu cầu: Mỗi câu không được quá 10 dòng code
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 3, 4, 5 ,6 ,5, 7, 1};
		System.out.println("Original array:" + Arrays.toString(arr));
		// Liệt kê các phần tử chỉ xuất hiện một lần duy nhất trong dãy N
		int[] uniqueNumbers = arrayHandle(arr, false);
		System.out.println("Unique numbers: "+ Arrays.toString(uniqueNumbers));
		// Liệt kê các phần tử xuất nhiều hơn một lần trong dãy N
		int[] repeatedNumbers= arrayHandle(arr, true);
		System.out.println("Repeated numbers: " + Arrays.toString(repeatedNumbers));
		
		
	}
	
	private static int[] arrayHandle (int[] arr, boolean repeated) {
		int count = 0;
		int[] result = new int[arr.length];
		boolean[] repeat = new boolean[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (!(repeat[i])) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[j] == arr[i]) {
						repeat[i] = true;
						repeat[j] = true;
					}
				}
				if (repeat[i] == repeated) {
					result[count++] = arr[i];
				}
			}
		}
		
		
		return Arrays.copyOf(result, count);
	}
		
}
