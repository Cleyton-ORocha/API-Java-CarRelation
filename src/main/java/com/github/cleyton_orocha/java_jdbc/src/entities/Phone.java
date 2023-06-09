package com.github.cleyton_orocha.java_jdbc.src.entities;

public class Phone {
	
	private int IDPhone;
	public static int maximumNumberOfDigits = 13;
	private String phone = null;
	private Integer ID_Owner;
	
	public Phone() {};
	
public Phone(String phone, Integer ID_Onwer, Integer IDPhone) {
		
		this.phone = phone;
		this.ID_Owner = ID_Onwer;
		this.IDPhone = IDPhone;
	}
	
	public Phone(String phone, Integer ID_Onwer) {
		
		this.phone = phone;
		
		this.ID_Owner = ID_Onwer;
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
