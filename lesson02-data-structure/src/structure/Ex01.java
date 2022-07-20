package structure;

import bean.Item;

public class Ex01 {
	
	private int a;
	private int b;
	
	private Ex01 (int a,int b) {
		this.a = a;
		this.b = b;
	}
	public static void main(String[] args) {
		
		
		int a = 5;
		int b = 10;
		a = 15;
		b = a;
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		
		modified(a);
		
		Ex01 element = new Ex01(5, 10);
		element.sum();
		
		System.out.println("a2: " +a);
		

		Integer i2 = 10;
		Integer i3 = 100;
		Integer i4 = 10;
		
		System.out.println("i2 hash : " + System.identityHashCode(i2));
		System.out.println("i3 hash : " + System.identityHashCode(i3));
		System.out.println("i4 hash : " + System.identityHashCode(i4));
		
		i2 = 999;
		
		System.out.println("i2 hash : " + System.identityHashCode(i2));
		
		Integer o2 = new Integer(100);
		Integer o3 = new Integer(1000);
		Integer o4 = new Integer(100);
		System.out.println("o2 hash : " + System.identityHashCode(o2));
		System.out.println("o3 hash : " + System.identityHashCode(o3));
		System.out.println("o4 hash : " + System.identityHashCode(o4));
		
		String s1 = "Hello";
		
		System.out.println("=====================");
		Item item1 = new Item(1, "Item A", 123);
		Item item2 = new Item(2, "Item B", 234);
		System.out.println(item1);
		System.out.println(item2);
		
		
	} 
	
	
	
	
	private static void modified( int a) {
		a = 99 ;
	}
	private int sum() {
		return this.a + this.b;
	}
}
