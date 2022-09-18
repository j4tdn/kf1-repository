package view;

import java.util.Arrays;

import bean.ItemDetail;
import model.DataModel;
import utils.CompareObjectHelper;
import utils.SortUtils;

public class Ex04BubbleSortWithItemDetail {
	public static void main(String[] args) {
		ItemDetail[] items = DataModel.getItemDetailWithNull();
		bubbleSort(items, (i1, i2) -> {
			if (i1 == null) {
				return -1;
			}
			if (i2 == null) {
				return 1;
			}
			int storeID1 = i1.getStoreID();
			int storeID2 = i2.getStoreID();
			
			int itemID1 = i1.getItemID();
			int itemID2 = i2.getItemID();
			
			if (storeID1 == storeID2) {
				return itemID2 - itemID1;
			}
			
			return storeID1 - storeID2;
		});
		System.out.println(Arrays.toString(items));
	}
	private static void bubbleSort(ItemDetail[] element, CompareObjectHelper helper) {
		for (int i = 0; i < element.length; i++) {
			for (int j = 0; j < element.length - i - 1; j++) {
				if (helper.compare(element[j], element[j+1]) > 0) {
					SortUtils.swap(element, j, j+1);
				}
			}
		}
	}
}
