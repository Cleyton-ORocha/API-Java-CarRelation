	package entities;

import java.time.LocalDate;

public class Car {
	private Marca brand;
	private String model;
	private LocalDate year;
	private Cor color;
	private Double price;
	
	public Car(Marca brand, String model, LocalDate year, Cor color, Double price) {
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.color = color;
		this.price = price;
	}
	
	
	

}
	
