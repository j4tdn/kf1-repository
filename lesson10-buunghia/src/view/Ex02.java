package view;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		 int[][] matrix = {{1, 2, 3, 4}, 
				 		   {5, 1, 8, 7}, 
				 		   {1, 9, 0, 9},
				 		   {2, 0, 6, 5}, 
				 		   {1, 2, 4, 5}};
		 printMatrix(matrix);
		 System.out.println("------------------------");
		 printMatrix(convertMatrix(matrix));
		 
	}
	private static void printMatrix(int[][] matrix){
		for (int i = 0; i < matrix.length; i++) {
			 System.out.println(Arrays.toString(matrix[i]));
		 }
	}
	private static int[][] convertMatrix(int[][] matrix) {
		int height = matrix.length;
		int width = matrix[0].length;
		int[][] result = new int[height][width];
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				result[i][j] = matrix[i][j];
			}
		}
		for (int i = 0; i < height; i++) {
			for (int j = 0 ;j < width;j++) {
				if (matrix[i][j] == 0) {
					for (int m = 0 ; m < height ; m++) {
						result[m][j] = 0;
					}
					for (int n = 0 ; n < width ; n++) {
						result[i][n] = 0;
					}
				}
			}
		}
		return result;
	}
		 
}

