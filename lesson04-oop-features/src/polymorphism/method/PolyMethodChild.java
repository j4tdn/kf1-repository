package polymorphism.method;

public class PolyMethodChild extends PolyMethodParent{
	public static void main(String[] args) {
		PolyMethodParent parent = new PolyMethodParent();
		System.out.println(parent.text);
		parent.log();
		
		System.out.println("=============");
		
		PolyMethodChild child = new PolyMethodChild();
		System.out.println(child.text);
		child.log();
		
		System.out.println("=============");
		PolyMethodParent poly = new PolyMethodChild();
		System.out.println(poly.text);
		poly.log();
	}
	
	String text = "child ==> text";
	
	@Override
	void log() {
		// annotation
		System.out.println("child ==> log");
	}
	
}