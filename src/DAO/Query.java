package DAO;


public class Query {
	//Without the WHERE as it will be specified in the function
	
	protected String selectAllOwner = "SELECT * FROM OWNER";
	protected String selectAllAddress = "SELECT * FROM ADDRESS";
	protected String selectAllCars = "SELECT * FROM CAR";
	protected String selectAllFactory = "SELECT FACTORYNAME FROM CAR ORDER BY FACTORYNAME";
	protected String selectPhones = "SELECT NUMERO FROM";

	
	protected static String insertOwner = "INSERT INTO OWNER (NAME, CPF, AGE, GENDER) VALUES(?, ?, ?, ?)";
	protected static String insertAdress = "INSERT INTO ADDRESS (STATE, CITY, DISTRICT, STREET, ID_OWNER) VALUES(?, ?, ?, ?, ?)";
	protected static String insertCar = "INSERT INTO CAR (YEAR, PRICE, COLOR, BRAND, FACTORYNAME, ID_OWNER) VALUES(?, ?, ?, ?, ?, ?, ?)";
	protected static String insertPhone = "INSERT INTO PHONE (NUMERO) VALUES(?)";
	
	
	protected static String updateOwner = "UPDATE Owner SET "
			  + "NAME = ?,"
			  + "CPF = ?,"
			  + "AGE = ?," 
			  + "GENDER = ?,";
	
	protected static String updateAddress = "UPDATE ADDRESS SET "
			  + "STATE = ?,"
			  + "CITY = ?,"
			  + "DISTRICT = ?," 
			  + "STREET = ?,"
			  + "ID_OWNER = ?"; 
	
	protected static String updateCar = "UPDATE CAR SET "
			  + "YEAR = ?,"
			  + "PRICE = ?,"
			  + "COLOR = ?," 
			  + "BRAND = ?,"
			  + "FACTORYNAME = ?"
			  + "ID_OWNER = ?"; 
	
	protected static String updatePhone = "UPDATE PHONE SET "
			  + "NUMERO = ?"; 
	
	// DANGER!!!
	protected String deleteIDOwner = "DELETE FROM Owner WHERE ";
	protected String deleteIDAddress = "DELETE FROM ADDRESS WHERE ";
	protected String deleteIDCar = "DELETE FROM CAR WHERE ";
	protected String deleteIDPhone = "DELETE FROM PHONE WHERE ";

}
