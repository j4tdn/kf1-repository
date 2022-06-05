package ex04;

public class ReferenceBook extends Book {

	private double tax;

	public ReferenceBook() {
	}

	public ReferenceBook(String id, double price, String publisher, double tax) {
		this.tax = tax;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + this.tax;
	}

	@Override
	double getBill() {
		return price * (1 + tax);
	}

}
