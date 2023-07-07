package controllers;

import java.io.IOException;

import components.SwitchScene;
import database.UserData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class UserSignupC {
	SwitchScene goTo = new SwitchScene();
	UserData user = new UserData();
	@FXML 
	private TextField txtName, txtContactNum, txtAddress, txtBirthday, txtPassword, txtPasswordConfirm;
	
	public void switchToUserDashboard(ActionEvent event) throws IOException {
		insertData();
		goTo.switchScene(event, "/fxml/UserDashboard.fxml","User Dashboard Section");
	}
	
	public void insertData() {
		String name = txtName.getText();
		String contactNum = txtContactNum.getText();
		String address = txtAddress.getText();
		String birthday = txtBirthday.getText();
		String password = txtPassword.getText(); //Temporary(Add confirmation is password match)
	
		user.insertUserData(name, contactNum, address, birthday, password);
	}
	
	
}
