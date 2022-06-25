package view;

public class Ex03AccountRegister {
	public static void main(String[] args) throws Exception {
		String password = "123";
		
		try {
			System.out.println("isValid: " + isValidPass(password));
		} catch (NullPointerException | InvalidPasswordException e) {
			// System.out.println(">>>>>>>>>>>>>>> " + e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("Finished !!!");
	}
	
	private static boolean isValidPass(String password) throws InvalidPasswordException {
		if (password == null) {
			throw new NullPointerException(">>>>>>>>>>>> Password cannot be NULL");
		}
		
		if (password.length() < 8) {
			throw new InvalidPasswordException(">>>>>>>>>>> At least 8 characters");
		}
		
		if (password.length() > 256) {
			throw new InvalidPasswordException(">>>>>>>>>>> At most 256 characters");
		}
		
		return true;
	}
}
