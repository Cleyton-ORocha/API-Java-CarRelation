package connections;

import java.sql.Connection;
import java.sql.DriverManager;

public class ClassConnector {

	// Declarando o username do banco
	private final static String USERNAME = "root";
	// Declarando a senha do banco
	private final static String PASSWORD = "wera";
	// Declarando o caminho do database com o padrão jdbc
	private final static String DATABASE_URL = "jdbc:mysql://localhost:3306/API-Java-CarRelation";

	public static Connection connectionToMysql() throws Exception {

		// Apontando para o Driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Passando as informações para o driver e conectando ao banco
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);

		return connection;
	}

	public static void main(String[] args) throws Exception {
		Connection conexao = connectionToMysql();

		// Verifica se o banco já está conectado para não haver duplicadas
		if (conexao != null) {
			System.out.println("Conexão obtida");
			conexao.close();
		}
	}
}
