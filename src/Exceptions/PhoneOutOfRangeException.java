package Exceptions;

public class PhoneOutOfRangeException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public PhoneOutOfRangeException(String msg) {
		super(msg);
	}
}