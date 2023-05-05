package entities;

import Enum.Gender;

public class Owner {
	
	private String name;
	private int age;
	private Address address;
	private String phone;
	private String cpf;
	private Gender gender;

	public Owner() {
	};
	
	public Owner(String name, int age, Address address, String phone, String cpf, Gender gender) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.phone = phone;
		this.cpf = cpf;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	
	
}
