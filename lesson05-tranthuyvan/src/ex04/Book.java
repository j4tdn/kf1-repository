package ex04;

public abstract class Book {

	protected String idBook;
	protected double price;
	protected String publisher;

	public Book() {
	}

	public Book(String idBook, double price, String publisher) {
		this.idBook = idBook;
		this.price = price;
		this.publisher = publisher;
	}

	public String getIdBook() {
		return idBook;
	}

	public void setIdBook(String idBook) {
		this.idBook = idBook;
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

	@Override
	public String toString() {
		return idBook + ", " + price + ", " + publisher;
	}

	abstract double getBill();

}
