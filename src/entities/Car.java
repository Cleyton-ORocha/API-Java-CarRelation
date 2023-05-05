package entities;

import Enum.Brand;
import Enum.Color;
import Exceptions.YearCarException;

public class Car {
	private Brand brand;
	private Integer year;
	private Color color;
	private Double price;
	
	public Car(Brand brand, Integer year, Color color, Double price) {
		
		if(year < 1950 && year >2023) {
			throw new YearCarException("Year of car out of range");
		}
		
		this.brand = brand;
		this.year = year;
		this.color = color;
		this.price = price;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
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

	public void setColor(Color color) {
		this.color = color;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	
	
	

}
	
