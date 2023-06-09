package com.github.cleyton_orocha.java_jdbc.src.controller;

public class Prints {

	
	// First question for the user
	public static void firstMenu() {
		
		System.out.println("\nWelcome to the Car Management System!!\n" 
				+ "Choose a code: \n" 
				+ "1 - Registry\n"
				+ "2 - Source\n" 
				+ "3 - Exit\n");

	}
	
	public static void secondMenu() {
		System.out.println("\nChoose a code: \n" 
				+ "1 - Insert \n" 
				+ "2 - Delete \n" 
				+ "3 - Update \n"
				+ "4 - Back \n" 
				+ "5 - Exit \n");
	}

	
	public static void thirdMenu() {
		System.out.println("\nChoose a code: \n" 
				+ "1 - Insert Owner \n" 
				+ "2 - Insert Car for Owner \n" 
				+ "3 - Insert Address for Owner \n"
				+ "4 - Insert Phone for Owner \n"
				+ "5 - Back \n" 
				+ "6 - Exit \n");		
	}

	public static void fourthMenu() {
		System.out.println("\nChoose a code: \n" 
				+ "1 - Delete Owner \n" 
				+ "2 - Delete the owner's car\n" 
				+ "3 - Delete owner address \n"
				+ "4 - Delete phone owner \n"
				+ "5 - Back \n" 
				+ "6 - Exit");		
	}
	
	public static void fifthMenu() {
		System.out.println("Choose a code: \n" 
				+ "1 - Update Owner \n" 
				+ "2 - Update the owner's car\n" 
				+ "3 - Update owner address \n"
				+ "4 - Update phone owner \n"
				+ "5 - Back \n"
				+ "6 - Exit");		
	}
	public static void sixthMenu() {
		System.out.println("Choose a code: \n" 
				+ "1 - Select owner data by ID \n"
				+ "2 - Select owner cars by ID \n"
				+ "3 - Select owner address by ID \n"
				+ "4 - Select owner phones by ID \n"
				+ "5 - Back \n"
				+ "6 - Exit");		
	}
	

	
}
