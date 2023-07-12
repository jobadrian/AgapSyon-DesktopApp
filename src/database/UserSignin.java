package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import components.CurrentUser;

public class UserSignin {
	ConnectDatabase connect = new ConnectDatabase();
	private String sql;
	public String contactNo, password;
	
	public void getUserData(String contactNum) {
		connect.createConnection();
		try {
			sql = "SELECT * FROM user_info WHERE contact_no = " +"'" +contactNum +"'";
			Statement statement = connect.connection.createStatement();
			ResultSet result = statement.executeQuery(sql);
			while(result.next()) { 
				contactNo = result.getString("contact_no");
				password = result.getString("password");
				CurrentUser.currentUser = result.getString("name");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
