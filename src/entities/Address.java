package entities;

public class Address {
	private String State;
	private String City;
	private String District;
	private String Street;
	
	public Address(String state, String city, String district, String street) {
		State = state;
		City = city;
		District = district;
		Street = street;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getDistrict() {
		return District;
	}
	public void setDistrict(String district) {
		District = district;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	
	
	
}
