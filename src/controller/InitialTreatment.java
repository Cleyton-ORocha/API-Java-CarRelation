package controller;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InitialTreatment {

	public static Integer treatment(Integer quantityItems, String namePrint) {
		Scanner scan = new Scanner(System.in);
	
		// Deixa o método mais eficaz
		quantityItems++;
		List<Integer> vet = new ArrayList<>();
		
		for(int i = 1;i != quantityItems; i++ ) {
			vet.add(i);
		}
		
		while (!scan.hasNextInt()) {
			System.out.println("Enter only integers");
			Prints.First();
			scan.next();
		}
		
		Integer cod = scan.nextInt();
		

		//Treats whether the variable is an integer or contains in vet
		while (!(vet.contains(cod))) {
			System.out.println("Enter a code between:" + vet);
			
			mes(namePrint);
			
			cod = scan.nextInt();
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

}
