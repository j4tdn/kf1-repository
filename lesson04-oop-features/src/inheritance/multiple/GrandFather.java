package inheritance.multiple;

public interface GrandFather {
	// JAVA08: default, static
	// JAVA09: private
	default void cooking() {
		System.out.println("Bad");
	}
	
	void hello();
	
	// JAVA designer
	// Interface: List
	// Implementation classes: ArrayList, LinkedList, Stack, Queue .... 100
}
