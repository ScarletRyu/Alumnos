
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Main {

	public static void main(String[] args) {
		try {
			//se carga el diver
			Class.forName("com.mysql.jdbc.Driver");
			//crear la connexion con la BBDD biblioteca
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/escuela", "root", "");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
