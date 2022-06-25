package view;

public class Ex03AccountRegister {
	public static void main(String[] args) {
		String password = "abcxu12";

		try {
			System.out.println("isValid: " + isValidPass(password));
		} catch (InvalidPasswordException e) {
			System.out.println(">>>>>>>>>> " + e.getMessage());
		}

	}

	private static boolean isValidPass(String password) throws InvalidPasswordException {
		if (password.length() < 8) {
			throw new InvalidPasswordException(">>>>>>>> At least 8 characters");
		}

		if (password.length() > 256) {
			throw new InvalidPasswordException(">>>>>>>> At most 256 characters");
		}

		return true;
	}
}
