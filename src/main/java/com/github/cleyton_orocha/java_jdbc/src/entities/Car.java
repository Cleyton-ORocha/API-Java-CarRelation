package com.github.cleyton_orocha.java_jdbc.src.entities;

import com.github.cleyton_orocha.java_jdbc.src.enums.Brand;
import com.github.cleyton_orocha.java_jdbc.src.enums.Color;

public class Car {

	private int IDCar;
	private Integer year;
	private Double price;
	private Color color;
	private Brand brand;
	private String factoryName;
	private Integer ID_Owner;
	
	public Car() {}
	
	public Car(Brand brand, Integer year, Color color, Double price, String factoryName, Integer ID_Owner, int IDCar) {
		
		this.brand = brand;
		this.year = year;
		this.color = color;
		this.price = price;
		this.factoryName = factoryName;
		this.ID_Owner = ID_Owner;
		this.IDCar = IDCar;
	}
	
	public Car(Brand brand, Integer year, Color color, Double price, String factoryName, Integer ID_Owner) {
		
		this.brand = brand;
		this.year = year;
		this.color = color;
		this.price = price;
		this.factoryName = factoryName;
		this.ID_Owner = ID_Owner;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = Brand.valueOf(brand);
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = Color.valueOf(color);
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getID_Owner() {
		return ID_Owner;
	}

	public void setIDOwner(int iD_Owner) {
		ID_Owner = iD_Owner;
	}

	public String getFactoryName() {
		return factoryName;
	}

	public void setFactoryName(String factoryName) {
		this.factoryName = factoryName;
	}

	public int getIDCar() {
		return IDCar;
	}

	public void setIDCar(int iDCar) {
		IDCar = iDCar;
	}
	
	
	
	
	
	
	

}
	
