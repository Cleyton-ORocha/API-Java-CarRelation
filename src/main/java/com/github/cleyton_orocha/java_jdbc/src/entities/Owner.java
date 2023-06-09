package com.github.cleyton_orocha.java_jdbc.src.entities;

import java.util.ArrayList;
import java.util.List;

import com.github.cleyton_orocha.java_jdbc.src.enums.Gender;

public class Owner {
	
	private int ID_Owner;
	private String name;
	private int age;
	private Address address;
	private List<Phone> listPhone = new ArrayList<>();
	private String cpf;
	private Gender gender;
	
	public Owner() {}

	public Owner(int ID) {
		this.ID_Owner = ID;
	}

	public Owner(String name, int age, String cpf, Gender gender) {
		
		this.name = name;
		this.age = age;
		this.cpf = cpf;
		this.gender = gender;
	}

	public Owner(String name, int age, String cpf, Gender gender, int ID_Owner) {
		this.ID_Owner = ID_Owner;
		this.name = name;
		this.age = age;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Gender getGender() {
		return gender;
	}
	
	// Conversor de String para ENUM. O valor tem que ser igual
	public void setGender(String gender) {
		this.gender = Gender.valueOf(gender);
	}
	
	public int getID() {
		return ID_Owner;
	}

	public void setID(int iD) {
		ID_Owner = iD;
	}


	
	public void addListPhone(Phone phone) {
		listPhone.add(phone);
	}
	
	public void removeListPhone(Phone phone) {
		listPhone.remove(phone);
	}
	
	public List<Phone> getListPhone() {
		return listPhone;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("What's your name?");
		
		
		
	}
}
