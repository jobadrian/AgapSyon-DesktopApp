package database;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class UserData {
	ConnectDatabase connect = new ConnectDatabase();
	private String sql;
	
	public void insertUserData(String name, String contactNo, String address, String birthday, String password) {
		connect.createConnection();
		try {
			Statement statement = connect.connection.createStatement();
			sql = "insert into user_info(name, contact_no, address, birthday, password)"
			+"values("+"'"+name+"'" +","+"'"+contactNo+"'"+","+"'"+address+"'"+","+"'"+birthday+"'"+","+"'"+password+"'"+")";
			statement.executeUpdate(sql);
			JOptionPane.showMessageDialog(null, "Sign Up Successful!(Temporary Prompt)");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
