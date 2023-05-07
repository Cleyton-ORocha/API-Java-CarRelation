package DAO;


public class Query {
	//Without the WHERE as it will be specified in the function
	
	protected static String selectAllOwner = "SELECT * FROM OWNER";
	protected static String selectAllAddress = "SELECT * FROM ADDRESS";
	protected static String selectAllCars = "SELECT * FROM CAR";
	protected static String selectAllFactory = "SELECT FACTORYNAME FROM CAR ORDER BY FACTORYNAME";
	protected static String selectPhones = "SELECT * FROM PHONE";

	
	protected static String insertOwner = "INSERT INTO OWNER (NAME, CPF, AGE, GENDER) VALUES(?, ?, ?, ?)";
	protected static String insertAddress = "INSERT INTO ADDRESS (STATE, CITY, DISTRICT, STREET, ID_OWNER) VALUES(?, ?, ?, ?, ?)";
	protected static String insertCar = "INSERT INTO CAR (YEAR, PRICE, COLOR, BRAND, FACTORYNAME, ID_OWNER) VALUES(?, ?, ?, ?, ?, ?, ?)";
	protected static String insertPhone = "INSERT INTO PHONE (NUMERO, ID_OWNER) VALUES(?, ?)";
	
	
	protected static String updateOwner = "UPDATE Owner SET "
			  + "NAME = ?,"
			  + "CPF = ?,"
			  + "AGE = ?," 
			  + "GENDER = ?,"
			  + "WHERE "; 
	
	protected static String updateAddress = "UPDATE ADDRESS SET "
			  + "STATE = ?,"
			  + "CITY = ?,"
			  + "DISTRICT = ?," 
			  + "STREET = ?,"
			  + "ID_OWNER = ?"
			  + "WHERE "; 
	
	protected static String updateCar = "UPDATE CAR SET "
			  + "YEAR = ?,"
			  + "PRICE = ?,"
			  + "COLOR = ?," 
			  + "BRAND = ?,"
			  + "FACTORYNAME = ?"
			  + "ID_OWNER = ?"
			  + "WHERE "; 
	
	protected static String updatePhone = "UPDATE PHONE SET "
			  + "NUMERO = ?"
			  + "ID_OWNER = ?"
			  + "WHERE "; 
	
	// DANGER!!!
	protected static String deleteIDOwner = "DELETE FROM Owner WHERE ";
	protected static String deleteIDAddress = "DELETE FROM ADDRESS WHERE ";
	protected static String deleteIDCar = "DELETE FROM CAR WHERE ";
	protected static String deleteIDPhone = "DELETE FROM PHONE WHERE ";

}
