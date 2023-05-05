package entities;

import Enum.UF;

public class Address {
	private UF state;
	private String city;
	private String district;
	private String street;
	
	public Address(UF state, String city, String district, String street) {
		this.state = state;
		this.city = city;
		this.district = district;
		this.street = street;
	}
	public UF getstate() {
		return state;
	}
	public void setstate(UF state) {
		this.state = state;
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
	
	
	
}
