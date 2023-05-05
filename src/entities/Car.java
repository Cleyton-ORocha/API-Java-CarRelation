package entities;

import java.time.LocalDate;

import Enum.Brand;
import Enum.Color;

public class Car {
	private Brand brand;
	private LocalDate year;
	private Color color;
	private Double price;
	
	public Car(Brand brand, LocalDate year, Color color, Double price) {
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

	public LocalDate getYear() {
		return year;
	}

	public void setYear(LocalDate year) {
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
	
