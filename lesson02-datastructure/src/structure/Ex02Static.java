package structure;

public class Ex02Static {
	private int a;
	private int b;
	
	public Ex02Static(int a, int b) {
		this.a = a;
		this.b = b;		
	}
	public static void main(String[] args) {
		Ex02Static.modified(22);
		
		Ex02Static element = new Ex02Static(5, 10);
		element.sum();
		
		Ex02Static element02 = new Ex02Static(50, 100);
		element02.sum();
		
		}

	private static void modified(int a) {
		a = 99;	
	}

	private int sum() {
		return this.a + this.b;
	}
}
	
