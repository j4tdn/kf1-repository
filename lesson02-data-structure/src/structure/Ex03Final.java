package structure;

import bean.Item;

public class Ex03Final {
	public static void main(String[] args) {
		int number = 18;
		int digit = 55;
		
		number = digit;
		Item item1 = new Item(1, "Item A", 123);
		Item item2 = new Item(2, "Item B", 234);
		System.out.println(item1);
		System.out.println(item2);
	}
}
