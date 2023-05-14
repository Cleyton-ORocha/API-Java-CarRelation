package entities;

import exceptions.PhoneOutOfRangeException;

public class Phone {
	
	private int IDPhone;
	public static int maximumNumberOfDigits = 13;
	private String phone = null;
	private int quantity = String.valueOf(phone).length();
	private int ID_Owner;
	
	public Phone() {
	}

	public Phone(String phone) {
		
		if(quantity != maximumNumberOfDigits) {
			throw new PhoneOutOfRangeException("Number of digits less or greater than 13");
		}
		this.phone = phone;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
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
