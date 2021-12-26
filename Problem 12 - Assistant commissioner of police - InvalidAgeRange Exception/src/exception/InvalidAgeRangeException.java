package exception;

public class InvalidAgeRangeException extends Exception {

	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "You are not eligible";
	}

}
