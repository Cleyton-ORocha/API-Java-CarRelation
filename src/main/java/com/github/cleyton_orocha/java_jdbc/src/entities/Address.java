package com.github.cleyton_orocha.java_jdbc.src.entities;

import com.github.cleyton_orocha.java_jdbc.src.enums.UF;

public class Address {
	
	private int IDAddress;
	private UF state;
	private String city;
	private String district;
	private String street;
	private int ID_Owner;
	
	
	public Address() {}
	
	public Address(UF state, String city, String district, String street, int ID_Owner) {
		this.state = state;
		this.city = city;
		this.district = district;
		this.street = street;
		this.ID_Owner = ID_Owner;
	}
	public UF getstate() {
		return state;
	}
	public void setstate(String state) {
		this.state = UF.valueOf(state);
	}
	public String getcity() {
		return city;
	}
	public void setcity(String city) {
		this.city = city;
	}
	public String getdistrict() {
		return district;
	}
	public void setdistrict(String district) {
		this.district = district;
	}
	public String getstreet() {
		return street;
	}
	public void setstreet(String street) {
		this.street = street;
	}
	public int getIDAddress() {
		return IDAddress;
	}
	public void setIDAddress(int iDAddress) {
		IDAddress = iDAddress;
	}
	public int getID_Owner() {
		return ID_Owner;
	}
	public void setID_Owner(int iD_Owner) {
		ID_Owner = iD_Owner;
	}
	
	
	
	
}
