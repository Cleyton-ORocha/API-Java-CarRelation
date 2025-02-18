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
	protected static String insertCar = "INSERT INTO CAR (YEAR, PRICE, COLOR, BRAND, FACTORYNAME, ID_OWNER) VALUES(?, ?, ?, ?, ?, ?)";
	protected static String insertPhone = "INSERT INTO PHONE (PHONE, ID_OWNER) VALUES(?, ?)";
	
	
	protected static String updateOwner = "UPDATE OWNER SET "
			  + "NAME = ?,"
			  + "CPF = ?,"
			  + "AGE = ?," 
			  + "GENDER = ?"
			  + "WHERE "; 
	
	protected static String updateAddress = "UPDATE ADDRESS SET "
			  + "STATE = ?,"
			  + "CITY = ?,"
			  + "DISTRICT = ?," 
			  + "STREET = ?,"
			  + "ID_OWNER = ? "
			  + "WHERE "; 
	
	protected static String updateCar = "UPDATE CAR SET "
			  + "YEAR = ?,"
			  + "PRICE = ?,"
			  + "COLOR = ?," 
			  + "BRAND = ?,"
			  + "FACTORYNAME = ?,"
			  + "ID_OWNER = ? "
			  + "WHERE "; 
	
	protected static String updatePhone = "UPDATE PHONE SET "
			  + "PHONE = ?,"
			  + "ID_OWNER = ? "
			  + "WHERE "; 
	
	// DANGER!!!
	protected static String deleteIDOwner = "DELETE FROM OWNER WHERE ";
	protected static String deleteIDAddress = "DELETE FROM ADDRESS WHERE ";
	protected static String deleteIDCar = "DELETE FROM CAR WHERE ";
	protected static String deleteIDPhone = "DELETE FROM PHONE WHERE ";

	
	protected static String selectOwnerCar = "SELECT W.IDOwner, W.NAME, C.BRAND, C.PRICE, C.COLOR, C.FactoryName, C.Year "
			+ "FROM OWNER W "
			+ "INNER JOIN CAR C "
			+ "ON W.IDOwner = C.ID_Owner "
			+ "WHERE W.IDOwner = ?";
	
	protected static String selectOwnerAddress = "SELECT W.IDOwner, W.NAME, A.STATE, A.CITY, A.DISTRICT, A.STREET "  
			+ "FROM OWNER W "
			+ "INNER JOIN ADDRESS A "
			+ "ON A.ID_Owner = W.IDOwner "
			+ "WHERE W.IDOwner = ?";
	
	protected static String selectOwnerPhone = "SELECT W.IDOwner, W.NAME, P.PHONE "
			+ "FROM OWNER W "
			+ "INNER JOIN PHONE P "
			+ "ON P.ID_Owner = W.IDOwner " 
			+ "WHERE W.IDOwner = ?";
}
