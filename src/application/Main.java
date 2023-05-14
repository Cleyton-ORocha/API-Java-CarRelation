package application;

import java.util.Scanner;

import controller.InitialTreatment;
import controller.Prints;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Prints.First();

		Integer cod = InitialTreatment.treatment(3, "First");

		if (cod == 1) {
			
			Prints.Second();
			cod = InitialTreatment.treatment(4, "Second");

			if (cod == 1) {
				Prints.Third();

				cod = InitialTreatment.treatment(5, "Third");

			}

		}

	}

}
