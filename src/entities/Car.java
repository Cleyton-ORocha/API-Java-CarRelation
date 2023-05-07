package entities;

import Enum.Brand;
import Enum.Color;
import Exceptions.YearCarException;

public class Car {

	private int IDCar;
	private Integer year;
	private Double price;
	private Color color;
	private Brand brand;
	private String factoryName;
	private int ID_Owner;
	
	public Car(Brand brand, Integer year, Color color, Double price, String factoryName, int ID_Owner) {
		
		if(year < 1950 && year >2023) {
			throw new YearCarException("Year of car out of range");
		}
		
		this.brand = brand;
		this.year = year;
		this.color = color;
		this.price = price;
		this.ID_Owner = ID_Owner;
		this.factoryName = factoryName;
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
	
