package controller;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InitialTreatment {

	public static Integer treatment(Integer quantityItems, String namePrint) {
		Scanner scan = new Scanner(System.in);

		Integer cod = 0;
    
    		while (true) {

      			try {
        			cod = Integer.parseInt(scan.next());
      			} catch (Exception e) {
        			System.out.println("Enter only integers");
        			continue;
      			}

			if (cod < 1 || cod > quantityItems){
				System.out.println("Enter a code between: 1 and " + quantityItems);	
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

}
