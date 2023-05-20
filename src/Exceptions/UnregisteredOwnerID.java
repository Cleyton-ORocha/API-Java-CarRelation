package exceptions;

public class UnregisteredOwnerID extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public UnregisteredOwnerID(String msg) {
		super(msg);
	}
	
}
