package ex04;

public class RefBook extends Book {
	double tax;

	public RefBook() {}
	public RefBook(String code, double price, String publisher,double tax) {
		super(code , price , publisher);
		this.tax = tax;
		
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
}
