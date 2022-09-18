package model;

import bean.ItemDetail;

public class DataModel {
	private DataModel() {}
	public static ItemDetail[] getItemDetailWithNull() {
		return new ItemDetail[] {
			new ItemDetail(101, 1, "Item 101", 35),
			null, null,
			new ItemDetail(201, 2, "Item 201", 45),
			new ItemDetail(301, 3, "Item 301", 14),
			null,
			new ItemDetail(401, 4, "Item 401", 27),
			new ItemDetail(102, 1, "Item 102", 44),
			null,
			new ItemDetail(202, 2, "Item 202", 90),
			new ItemDetail(302, 3, "Item 302", 11)
		};
	}
	
	public static ItemDetail[] getItemDetails() {
		return new ItemDetail[] {
			new ItemDetail(101, 1, "Item 101", 35),
			new ItemDetail(201, 2, "Item 201", 45),
			new ItemDetail(301, 3, "Item 301", 14),
			new ItemDetail(401, 4, "Item 401", 27),
			new ItemDetail(102, 1, "Item 102", 44),
			new ItemDetail(202, 2, "Item 202", 90),
			new ItemDetail(302, 3, "Item 302", 11)
		};
	}
}
