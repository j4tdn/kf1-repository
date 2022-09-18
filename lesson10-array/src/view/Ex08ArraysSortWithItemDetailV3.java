package view;

import java.util.Arrays;

import bean.ItemDetail;
import model.DataModel;

public class Ex08ArraysSortWithItemDetailV3 {
	public static void main(String[] args) {
		ItemDetail[] items = DataModel.getItemDetails();
		
		// ItemDetails implement Comparable<ItemDetaail>
		Arrays.sort(items);
		System.out.println("1st sorted items: " + Arrays.toString(items));
		
		//Comparator<ItemDetail>
		Arrays.sort(items, (i1, i2) -> Double.compare(i1.getPrice(), i2.getPrice()));
		System.out.println("2nd sorted items: " + Arrays.toString(items));
		
		// Prefered : 2nd way (Comparator)
		//  + Reduce code in T class
		//  + Catch error at compile
		//  + Comparator support multiple sorting function concurrently
	}
}
