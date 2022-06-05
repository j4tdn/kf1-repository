package ex04;

import java.util.ArrayList;
import java.util.List;


public class Client {
	String code;
	String name;
	String phoneNumber;
	String address;
	List<Book> bookList = new ArrayList<Book>();
	public Client() {}
	public Client(String code, String name, String phoneNumber, String address) {
		this.code = code;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Book> getBookList() {
		return bookList;
	}
	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	
	
	
	
}
