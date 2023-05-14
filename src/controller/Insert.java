package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Address;
import entities.Car;
import entities.Owner;
import entities.Phone;
import enums.Brand;
import enums.Color;
import enums.Gender;
import enums.UF;

public class Insert {

	public static Owner InsertOwner() {
		Scanner scanner = new Scanner(System.in);

		Integer verification = null;

		Address address = null;
		List<Car> car = new ArrayList<>();
		Phone phone = null;

		System.out.println("Qual o nome do Dono");
		String name = scanner.nextLine();
		System.out.println("Qual a idade do Dono");
		Integer age = scanner.nextInt();
		System.out.println("Qual a idade do Dono");
		String CPF = scanner.nextLine();
		System.out.println("Qual o seu sexo?");
		Gender gender = Gender.valueOf(scanner.nextLine());

		Owner owner = new Owner(name, age, CPF, gender);

	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	private static Address InsertAddress() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Qual a UF do seu estado? (Digite apenas as siglas)");
		UF state = UF.valueOf(scanner.nextLine());

		System.out.println("Qual é a sua cidade?");
		String city = scanner.nextLine();

		System.out.println("Qual é o nome de seu bairro?");
		String district = scanner.nextLine();

		System.out.println("Qual o nome de sua rua?");
		String street = scanner.nextLine();

		System.out.println("Qual o id do Dono?");
		int ID_Owner = scanner.nextInt();

		scanner.close();

		return new Address(state, city, district, street, ID_Owner);
	}

	private static Car InsertCar() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Qual a marca do carro?");
		Brand brand = Brand.valueOf(scanner.nextLine());

		System.out.println("Qual a cor do carro?");
		Color color = Color.valueOf(scanner.nextLine());

		System.out.println("Qual o ano do carro?");
		Integer year = scanner.nextInt();

		System.out.println("Qual o valor do carro?");
		double price = scanner.nextDouble();

		System.out.println("Qual o nome da fabrica do carro?");
		String factoryName = scanner.nextLine();

		scanner.close();

		return new Car(brand, year, color, price, factoryName);

	}

	private static Phone InsertPhone() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Qual o número do telefone?");
		String phone = scanner.nextLine();

		int quantity = String.valueOf(phone).length();

		while (quantity != Phone.maximumNumberOfDigits) {
			System.out.println("Number of digits less or greater than 13");
			System.out.println("Qual o número do telefone?");
			phone = scanner.nextLine();
		}

		scanner.close();

		return new Phone(phone);
	}
}
