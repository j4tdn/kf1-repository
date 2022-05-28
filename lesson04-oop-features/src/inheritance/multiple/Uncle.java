package inheritance.multiple;

public interface Uncle extends GrandFather, GrandMother {

	@Override
	default void cooking() {
		GrandFather.super.cooking();
		GrandMother.super.cooking();
	}

}
