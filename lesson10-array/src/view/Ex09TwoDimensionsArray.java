package view;

import java.util.Arrays;

public class Ex09TwoDimensionsArray {
	public static void main(String[] args) {
		int[] oneD = { 1, 2, 3, 4, 5 };
		
		int[][] twoD = {
				{1,2}, //twoD[0]
				{2,3}  //twoD[1]
		};
		for (int i = 0; i < twoD.length; i++) {
			System.out.println(Arrays.toString(twoD[i]));
		}
			
	}
}
