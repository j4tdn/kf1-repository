package ex04;

public class App {
	public static void main(String[] args) {
		TextBook tb1 = new TextBook("SGK_001", 40d, "Nhi Đồng", "New");
		TextBook tb2 = new TextBook("SGK_002", 130d, "Nhi Đồng", "Old");
		TextBook tb3 = new TextBook("SGK_003", 160d, "Thiếu Nhi", "Old");
		
		ReferenceBook rb1 = new ReferenceBook("STK_001", 27d, "Thái Hà", 0.03);
		ReferenceBook rb2 = new ReferenceBook("STK_002", 300d, "Nhi Đồng", 0.04);
		 
		Book[] books = {tb1, tb2, tb3, rb1, rb2};
		
		System.out.println("Nhi Dong Books: ");
		BookUtils.findNhiDongBooks(books);
		System.out.println("===============================================");
		
		System.out.println("Books which have price less than 50: ");
		BookUtils.findBookLessThan50(books);
		System.out.println("===============================================");
		
		System.out.println("Books which have price from 100 to 200: ");
		BookUtils.findTextBookWithPricefrom100to200(books);
		System.out.println("===============================================");
		
		
		
	}

}
