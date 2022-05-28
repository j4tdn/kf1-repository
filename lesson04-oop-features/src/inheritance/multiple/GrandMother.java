package inheritance.multiple;

public interface GrandMother {
	default void cooking() {
		System.out.println("Good");
	}
}
