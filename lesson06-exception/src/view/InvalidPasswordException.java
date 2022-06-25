package view;

public class InvalidPasswordException extends Exception {
	private static final long serialVersionUID = -6697340465738118391L;

	public InvalidPasswordException(String message) {
		super(message);
	}
}
