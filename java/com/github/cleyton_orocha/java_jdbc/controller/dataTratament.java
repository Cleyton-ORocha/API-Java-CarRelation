package controller;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import enums.Brand;
import enums.Color;
import enums.Gender;
import enums.UF;



public class dataTratament {
	private static Scanner scan = new Scanner(System.in);

	public static Integer treatmentMenu(Integer quantityItems, String namePrint) {

		// Make the most effective method
		quantityItems++;
		List<Integer> vet = new ArrayList<>();
		for (int i = 1; i != quantityItems; i++) {
			vet.add(i);
		}
	

		Integer cod;

		while (true) {

			mes(namePrint);

			try {
				cod = scan.nextInt();
			} catch (InputMismatchException i) {
				System.out.println("Enter only integers");
				scan.next();
				continue;
			}

			// Treats whether the variable is an integer or contains in vet
			if (!(vet.contains(cod))) {
				System.out.println("Enter a code between:" + vet);

				continue;
			}

			break;
		}
		return cod;

	}

	public static Object mes(String methodName) {
		try {
			Prints checkPrint = new Prints();

			 // Create an instance of the class
		    Class<?> clazz = checkPrint.getClass();

		    // Get the method based on the name passed as a parameter
		    Method method = clazz.getDeclaredMethod(methodName);

		    // Invoke the method on the instance of the class
		    return method.invoke(checkPrint);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return methodName;
	}

	public static Brand tratamentBrand() {

		scan.nextLine();
		Brand brand = null;

		while (brand == null) {
			System.out.println("What's the car brand?");
			try {
				brand = Brand.valueOf(scan.nextLine().toUpperCase());
			} catch (IllegalArgumentException i) {
				System.out.println("Invalid Brand\n" + "Available brands:\n");
				for (Brand br : Brand.values()) {
					System.out.println(br + " ");
				}
				System.out.println("Type it again:");
			}
		}

		return brand;
	}

	public static Color tratamentColor() {

		Color color = null;

		while (color == null) {
			try {
				color = Color.valueOf(scan.nextLine().toUpperCase());
			} catch (IllegalArgumentException i) {
				System.out.println("Invalid Color\n" + "Available Colors:\n");
				for (Color cor : Color.values()) {
					System.out.println(cor);
				}

				System.out.println("Type it again:");
			}
		}
		return color;
	}

	public static Gender tratamentGender() {
		
		Gender gender = null;

		while (gender == null) {
			try {
				gender = Gender.valueOf(scan.nextLine().toUpperCase());
			} catch (IllegalArgumentException i) {
				System.out.println("Invalid option\n" + "Available Genders:\n");
				for (Gender genders : Gender.values()) {
					System.out.println(genders);
				}

				System.out.println("Type it again:");
			}
		}
		return gender;
	}

	public static UF tratamentUF() {
		
		scan.nextLine();
		UF uf = null;

		while (uf == null) {
			try {
				uf = UF.valueOf(scan.nextLine().toUpperCase());
			} catch (IllegalArgumentException i) {
				System.out.println("Invalid State\n" + "Available UFs:\n");
				for (UF ufs: UF.values()) {
					System.out.println(ufs);
				}

				System.out.println("Type it again:");
			}
		}
		return uf;
	}

	public static Integer tratamentIdOwner() {

		System.out.println("What is the owner's id??");
		while (!scan.hasNextInt()) {
			System.out.println("Enter only integers");
			System.out.println("What is the owner's id?");
			scan.next();
		}
		Integer ID_Owner = scan.nextInt();

		return ID_Owner;
	}
	
	public static Integer tratamentIdCar() {

		System.out.println("What is the car's id?");
		while (!scan.hasNextInt()) {
			System.out.println("Enter only integers");
			System.out.println("What is the car's id?");
			scan.next();
		}
		Integer ID_CAR = scan.nextInt();

		return ID_CAR;
	}
	
	public static Integer tratamentIdPhone() {

		System.out.println("What is the car's id?");
		while (!scan.hasNextInt()) {
			System.out.println("What is the phone's id?");
			System.out.println("Enter only integers");
			scan.next();
		}
		Integer ID_Owner = scan.nextInt();

		return ID_Owner;
	}

	public static Integer tratamentAge() {

		Integer age = null;

		while (age == null || age < 18 || age > 120) {
			System.out.println("How old is the Owner?");

			try {
				age = Integer.parseInt(scan.next());
			} catch (NumberFormatException n) {
				System.out.println("Enter only integer");
				continue;
			}

			if (age < 18 || age >= 120)
				System.out.println("Add only numbers between 18 to 120 years");

		}
		return age;
	}

	public static String tratamentCPF() {
		scan.nextLine();
		
		while (true) {
			System.out.println("What is the Owner's CPF?");

			while (true) {
				System.out.print("Enter the CPF (11 digits): ");
				String cpfString = scan.nextLine().replaceAll("[^\\d]", "");

				if (cpfString.matches("\\d{11}")) {
					return cpfString;
				}

				System.out.println("Invalid CPF! Enter a valid 11-digit CPF.");
			}
		}

	}
	
	public static String tratamentPhone() {
		scan.nextLine();
		
		while (true) {
			System.out.println("What's the phone number?");

			while (true) {
				System.out.print("Enter phone number (11 digits): ");
				String cpfString = scan.nextLine().replaceAll("[^\\d]", "");

				if (cpfString.matches("\\d{11}")) {
					return cpfString;
				}

				System.out.println("\nInvalid phone! \\nPlease enter a valid 11-digit phone number.");
			}
		}
	}

}
