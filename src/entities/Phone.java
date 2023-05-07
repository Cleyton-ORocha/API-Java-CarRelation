package entities;

import Exceptions.PhoneOutOfRangeException;

public class Phone {
	
	private int IDPhone;
	private int maximumNumberOfDigits = 13;
	private int phone = 0;
	private int quantity = String.valueOf(phone).length();
	private int ID_Owner;
	
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

	public int getIDPhone() {
		return IDPhone;
	}

	public void setIDPhone(int iDPhone) {
		IDPhone = iDPhone;
	}

	public int getID_Owner() {
		return ID_Owner;
	}

	public void setID_Owner(int iD_Owner) {
		ID_Owner = iD_Owner;
	}


	
	
}
