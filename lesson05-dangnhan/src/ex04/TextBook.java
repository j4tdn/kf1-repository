package ex04;

public class TextBook extends Book {
		
		public String Condition;
		
		public TextBook() {
			
		}

		public TextBook(String id, double price, String publicshingCompany, String condition) {
			super(id, price, publicshingCompany);
			Condition = condition;
		}

		public String getCondition() {
			return Condition;
		}

		public void setCondition(String condition) {
			Condition = condition;
		}
		
	}

		
		
