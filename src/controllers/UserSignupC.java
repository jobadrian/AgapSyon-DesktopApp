package controllers;

import java.io.IOException;

import javax.swing.JOptionPane;

import components.SwitchSceneActionEvent;
import database.UserData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class UserSignupC {
	SwitchSceneActionEvent goTo = new SwitchSceneActionEvent();
	UserData user = new UserData();
	@FXML 
	private TextField txtName, txtContactNum, txtAddress, txtBirthday, txtPassword, txtPasswordConfirm;
	String password, passwordConfirm;
	
	public void switchToUserDashboard(ActionEvent event) throws IOException {
		insertData();
		
		if(password.equals(passwordConfirm))
			goTo.switchScene(event, "/fxml/UserSignin.fxml","User Signin");
	}
	
	public void insertData() {
		String name = txtName.getText();
		String contactNum = txtContactNum.getText();
		String address = txtAddress.getText();
		String birthday = txtBirthday.getText();
		password = txtPassword.getText(); 
		passwordConfirm = txtPasswordConfirm.getText();
	
		if(password.equals(passwordConfirm))
			user.insertUserData(name, contactNum, address, birthday, password);
		else
			JOptionPane.showMessageDialog(null, "Password Must Match!(Temporary Prompt)");
	}
}
