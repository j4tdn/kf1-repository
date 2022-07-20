package view;

public class Ex03 {
	public static void main(String[] args) {
		String password = "123";
		
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println();
	}
	
	private static boolean isValidPass (String password) throws InvalidPasswordException {
		if (password == null) {
			throw new NullPointerException(">>>>>>>> Password can not be null");
		}
		if(password.length() < 8) {
			throw InvalidPasswordException(" At least 256 characters");
		}
		
		if (password.length() > 256) {
			throw new InvalidPasswordException("Cannot more than 256 characters");
		}
	}
}
