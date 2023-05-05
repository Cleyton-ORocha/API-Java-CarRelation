package entities;

import Exceptions.PhoneOutOfRangeException;

public class Phone {
	
	private int maximumNumberOfDigits = 13;
	private int phone = 0;
	private int quantity = String.valueOf(phone).length();
	
	public Phone() {
	}

	public Phone(int phone) {
		
		if(quantity != maximumNumberOfDigits) {
			throw new PhoneOutOfRangeException("Number of digits less or greater than 13");
		}
		this.phone = phone;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}
	
}
