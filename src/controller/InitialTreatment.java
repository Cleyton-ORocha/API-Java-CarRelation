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

public class InitialTreatment {
	private static Scanner scan = new Scanner(System.in);

	public static Integer treatmentMenu(Integer quantityItems, String namePrint) {

		// Deixa o método mais eficaz
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

	public static Object mes(String metodo) {
		try {
			Prints checkPrint = new Prints();

			// Criar uma instância da classe
			Class<?> classe = checkPrint.getClass();

			// Obter o método com base no nome passado como parâmetro
			Method meto = classe.getDeclaredMethod(metodo);

			// Invocar o método na instância da classe
			return meto.invoke(checkPrint);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return metodo;
	}

	public static Brand tratamentBrand() {

		scan.nextLine();
		Brand brand = null;

		while (brand == null) {
			System.out.println("Qual a marca do carro?");
			try {
				brand = Brand.valueOf(scan.nextLine().toUpperCase());
			} catch (IllegalArgumentException i) {
				System.out.println("Marca inválida\n" + "Marcas disponiveis:\n");
				for (Brand br : Brand.values()) {
					System.out.println(br + " ");
				}
				System.out.println("Digite Novamente:");
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
				System.out.println("Cor inválida\n" + "Cores disponiveis:\n");
				for (Color cor : Color.values()) {
					System.out.println(cor);
				}

				System.out.println("Digite Novamente:");
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
				System.out.println("Opção inválida\n" + "Gêneros disponiveis:\n");
				for (Gender genders : Gender.values()) {
					System.out.println(genders);
				}

				System.out.println("Digite Novamente:");
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
				System.out.println("Estado inválido\n" + "UFs disponiveis:\n");
				for (UF ufs: UF.values()) {
					System.out.println(ufs);
				}

				System.out.println("Digite Novamente:");
			}
		}
		return uf;
	}

	public static Integer tratamentIdOwner() {

		System.out.println("Qual o id do Dono?");
		while (!scan.hasNextInt()) {
			System.out.println("Enter only integers");
			System.out.println("Qual o id do Dono?");
			scan.next();
		}
		Integer ID_Owner = scan.nextInt();

		return ID_Owner;
	}
	
	public static Integer tratamentIdCar() {

		System.out.println("Qual o id do Carro?");
		while (!scan.hasNextInt()) {
			System.out.println("Enter only integers");
			System.out.println("Qual o id do Carro?");
			scan.next();
		}
		Integer ID_CAR = scan.nextInt();

		return ID_CAR;
	}
	
	public static Integer tratamentIdPhone() {

		System.out.println("Qual o id do telefone?");
		while (!scan.hasNextInt()) {
			System.out.println("Qual o id do telefone?");
			System.out.println("Enter only integers");
			scan.next();
		}
		Integer ID_Owner = scan.nextInt();

		return ID_Owner;
	}

	public static Integer tratamentAge() {

		Integer age = null;

		while (age == null || age < 18 || age > 120) {
			System.out.println("Qual a idade do Dono?");

			try {
				age = Integer.parseInt(scan.next());
			} catch (NumberFormatException n) {
				System.out.println("Enter only integer");
				continue;
			}

			if (age < 18 || age >= 120)
				System.out.println("Adicione somente numeros entre 18 a 120 anos");

		}
		return age;
	}

	public static String tratamentCPF() {
		scan.nextLine();
		
		while (true) {
			System.out.println("Qual o CPF do Dono?");

			while (true) {
				System.out.print("Digite o CPF (11 dígitos): ");
				String cpfString = scan.nextLine().replaceAll("[^\\d]", "");

				if (cpfString.matches("\\d{11}")) {
					return cpfString;
				}

				System.out.println("CPF inválido! Digite um CPF válido com 11 dígitos.");
			}
		}

	}
	
	public static String tratamentPhone() {
		scan.nextLine();
		
		while (true) {
			System.out.println("Qual o número do telefone?");

			while (true) {
				System.out.print("Digite o telefone (11 dígitos): ");
				String cpfString = scan.nextLine().replaceAll("[^\\d]", "");

				if (cpfString.matches("\\d{11}")) {
					return cpfString;
				}

				System.out.println("\nTelefone inválido! \nDigite um telefone válido com 11 dígitos.");
			}
		}
	}

}
