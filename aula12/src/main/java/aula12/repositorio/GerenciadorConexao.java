package aula12.repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GerenciadorConexao {
	
	public static Connection conectar()throws SQLException, ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306/aulajava";
		String usu = "root";
		String pass = "123456";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,usu,pass);
		return con;
	}
}
