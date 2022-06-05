package ex04;

public class Book {
	private String id;
	private double price;
	private String publicshingCompany;
	
	private Book () {
		
	}

	public Book(String id, double price, String publicshingCompany) {
		super();
		this.id = id;
		this.price = price;
		this.publicshingCompany = publicshingCompany;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPublicshingCompany() {
		return publicshingCompany;
	}

	public void setPublicshingCompany(String publicshingCompany) {
		this.publicshingCompany = publicshingCompany;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", price=" + price + ", publicshingCompany=" + publicshingCompany + "]";
	}
	
	
}
