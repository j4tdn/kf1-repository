package ex04;

public class Book {
	String code;
	double price;
	String publisher;
	public Book() {}
	public Book(String code, double price, String publisher) {
		this.code = code;
		this.price = price;
		this.publisher = publisher;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
}
