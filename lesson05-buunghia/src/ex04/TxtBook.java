package ex04;

public class TxtBook extends Book{
	boolean isOld;
	public TxtBook() {}
	public TxtBook(String code, double price, String publisher,boolean isOld) {
		super(code,price,publisher);
		this.isOld = isOld;
	}
	public boolean isOld() {
		return isOld;
	}
	public void setOld(boolean isOld) {
		this.isOld = isOld;
	}
	
	
	
	
}
