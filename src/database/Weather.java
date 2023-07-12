package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import components.CurrentDate;

public class Weather {
	ConnectDatabase connect = new ConnectDatabase();
	private String sql;
	public String date, temperature, condition, precipitation, hangin, halumigmig;
	
	public void getWeatherUpdates() {
		connect.createConnection();
		try {
			sql = "SELECT * FROM weather WHERE date = " +"'" +CurrentDate.currentDate +"'";
			Statement statement = connect.connection.createStatement();
			ResultSet result = statement.executeQuery(sql);
			while(result.next()) { 			
				date = result.getString("date");
				temperature = result.getString("temperature");
				condition = result.getString("condition");
				precipitation = result.getString("precipitation");
				hangin = result.getString("hangin");
				halumigmig = result.getString("halumigmig");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
