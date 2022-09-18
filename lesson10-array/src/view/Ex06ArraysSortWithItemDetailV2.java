package view;

import static java.util.Comparator.*;


import java.util.Arrays;

import bean.ItemDetail;
import model.DataModel;

public class Ex06ArraysSortWithItemDetailV2 {
	public static void main(String[] args) {
		ItemDetail[] items = DataModel.getItemDetailWithNull();
		
		Arrays.sort(items, nullsFirst(comparing(ItemDetail::getStoreID,reverseOrder()).
				thenComparing(ItemDetail::getItemID)));
		System.out.println(Arrays.toString(items));
	}
}
