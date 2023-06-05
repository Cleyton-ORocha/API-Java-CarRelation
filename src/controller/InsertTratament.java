package controller;

import java.util.Scanner;

import entities.Address;
import entities.Car;
import entities.Owner;
import entities.Phone;
import enums.Brand;
import enums.Color;
import enums.Gender;
import enums.UF;

public class InsertTratament {

	private static Scanner scan = new Scanner(System.in);
	public static Owner InsertOwner(String type) {

		System.out.println("What's the owner's name?");
		String name = scan.nextLine();

		int age = dataTratament.tratamentAge();

		String CPF = dataTratament.tratamentCPF();

		System.out.println("What's your gender?");
		Gender gender = dataTratament.tratamentGender();

		if (type == "INSERT") {
			return new Owner(name, age, CPF, gender);
		} else if (type == "UPDATE") {

			int ID_Owner = dataTratament.tratamentIdOwner();

			return new Owner(name, age, CPF, gender, ID_Owner);
		} else {
			throw new RuntimeException("Erro de input insertTratament");
		}

	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public static Car InsertCar(String type) {

		Integer year = null;

		Integer ID_Owner = dataTratament.tratamentIdOwner();

		Brand brand = dataTratament.tratamentBrand();

		System.out.println("What color is the car?");
		Color color = dataTratament.tratamentColor();

		System.out.println("What year is the car?");

		// Tratamento do ano do carro
		while (year == null || year <= 1950 || year >= 2023) {

			while (!scan.hasNextInt()) {
				System.out.println("Enter only integers");
				System.out.println("What year is the car?");
				scan.next();
			}

			year = scan.nextInt();

			if (year <= 1950 || year >= 2023)
				System.out.println("Year of car out of range!\n" + "Please enter a year between 1950 and 2023:");
		}

		// Tratamento do valor do carro
		System.out.println("What is the value of the car?");
		while (!scan.hasNextDouble()) {
			System.out.println("Enter only numbers");
			System.out.println("What is the value of the car?");
			scan.next();
		}
		double price = scan.nextDouble();

		scan.nextLine();

		System.out.println("What is the name of the car factory?");
		String factoryName = scan.nextLine();

		if (type.toUpperCase() == "INSERT") {
			
			return new Car(brand, year, color, price, factoryName, ID_Owner);
		} else if (type.toUpperCase() == "UPDATE") {

			int IDCar = dataTratament.tratamentIdCar();
			
			return new Car(brand, year, color, price, factoryName, ID_Owner, IDCar);

		} else
			
		throw new RuntimeException("Erro de input insertTratament");

	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public static Address InsertAddress() {

		int ID_Owner = dataTratament.tratamentIdOwner();

		System.out.println("What is the UF of your state? (Type only the abbreviations)");
		UF state = dataTratament.tratamentUF();

		System.out.println("What is your city?");
		String city = scan.nextLine();

		System.out.println("What is the name of your neighborhood?");
		String district = scan.nextLine();

		System.out.println("What is your street name?");
		String street = scan.nextLine();

		

		return new Address(state, city, district, street, ID_Owner);

	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public static Phone InsertPhone(String type) {

		int ID_Owner = dataTratament.tratamentIdOwner();

		String phone = dataTratament.tratamentPhone();

		if (type == "INSERT") {
			
			
			return new Phone(phone, ID_Owner);
		}

		else if (type == "UPDATE") {

			int IDPhone = dataTratament.tratamentIdPhone();
			
			
			return new Phone(phone, ID_Owner, IDPhone);
			
		} else
			
		throw new RuntimeException("Erro de input insertTratament");

	}
}
