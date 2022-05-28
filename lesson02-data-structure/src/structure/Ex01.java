package structure;

import bean.Item;

public class Ex01 {
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		a = 15;
		b = a;
		System.out.println("a1: " + a);
		System.out.println("b2: " + b);
		
		modified(a);
		System.out.println("a2: " + a); // fn Esc --> ctrl [fn] f11
		/* 
		 * 
		 Operator = : perform at STACK
		 Variable   : store at STACK
		  
		 1. Primitive Type: 
		    Example : int, float, char, double ...
		    Usage   : Use types defined already in JAVA
		              Cannot custom
		    Target  : Store Data
		    Memory  : Stack
		    
		    
		 2. Object Type
		    Example : Integer, Float, String, Double, Long, Scanner, Item ...
		    Usage   : Use types defined already in JAVA: Immutable class, cannot update attribute's value
		    
		              Can custom, create own object type --> Employee, Item, Student
		    
		    Target  : Store Data
		            : Helper methods
		    Memory  : Heap         
		*/
		Integer i2 = 10; // HEAP --> CONSTANT POOL
		Integer i3 = 100; // create new memory cell
		Integer i4 = 10; // do not create new memory cell
		System.out.println("i2 hash: " + System.identityHashCode(i2));
		System.out.println("i3 hash: " + System.identityHashCode(i3));
		System.out.println("i4 hash: " + System.identityHashCode(i4));
		
		i2 = 999;
		System.out.println("i2 hash: " + System.identityHashCode(i2));
		
		System.out.println("===================");
		
		Integer o2 = new Integer(100); // new --> HEAP --> NORMAL
		Integer o3 = new Integer(1000); // always create new memory
		Integer o4 = new Integer(100); // always create new memory
		System.out.println("o2 hash: " + System.identityHashCode(o2));
		System.out.println("o3 hash: " + System.identityHashCode(o3));
		System.out.println("o4 hash: " + System.identityHashCode(o4));
		
		String s1 = "welcome";
		String s2 = new String("goodbye");
		
		System.out.println("===================");
		Item item1 = new Item(1, "Item A", 123);
		Item item2 = new Item(2, "Item B", 234);
		System.out.println(item1);
		System.out.println(item2);
	}
	
	// pass by value
	// int input = a;
	private static void modified(int input) {
		input = 999;
	}
}
