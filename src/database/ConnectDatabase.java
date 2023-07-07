package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class ConnectDatabase {
	public Connection connection; 
	private final String URL = "jdbc:mysql://localhost:3306/agapsyon_database"; 
	private final String USERNAME = "root"; 
	private final String PASSWORD = "Johanten222001";
	public String username;
	public String password;
	
	public void createConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
			Statement statement = connection.createStatement();
			JOptionPane.showMessageDialog(null, "Connection Success!(Temporary Prompt)");
			statement.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
}
