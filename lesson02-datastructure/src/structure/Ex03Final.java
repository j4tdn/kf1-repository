package structure;

import bean.Item;

public class Ex03Final {
	public static void main(String[] args) {
		/*
		 *Operator = : perform at STACK
		 
		 Final: Unchangeable - Always happen at STACK
		      : cannot use = operator, reassign value at STACK again
		 + Primitive Type: unable to update value
		 + Object Type: able to update value
		 + Class *
		 */
		
		final int number = 10;
		final int digit = 55;
		
		// number = digit;
		
		System.out.println("number: " + number);
		System.out.println("digit: " + digit);
		
		System.out.println("===================");
		
		final Item item1 = new Item(1, "Item A", 123);
		Item item2 = new Item(2, "Item B", 234);
		// item1 = item2;
		item1.setName("Updated Name");
		
		System.out.println(item1);
		System.out.println(item2);
		
	}

}
