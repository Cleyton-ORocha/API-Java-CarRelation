package connections;

import java.sql.Connection;
import java.sql.DriverManager;

public class ClassConnector {

	// Declare the database username
	private final static String USERNAME = "root";
	// Declare the database password
	private final static String PASSWORD = "wera";
	// Declare the database URL using the JDBC format
	private final static String DATABASE_URL = "jdbc:mysql://localhost:3306/api_java_carrelation";

	public static Connection connectionToMysql() throws Exception {

	    // Point to the driver
	    Class.forName("com.mysql.cj.jdbc.Driver");

	    // Provide the information to the driver and connect to the database
	    Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);

	    return connection;
	}

	public static void main(String[] args) throws Exception {
	    Connection connection = connectionToMysql();

	    // Check if the connection to the database is established to avoid duplicates
	    if (connection != null) {
	        System.out.println("Connection obtained");
	        connection.close();
	    }
	}
}
