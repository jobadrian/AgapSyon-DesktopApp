package controllers;

import java.io.IOException;

import javax.swing.JOptionPane;

import components.SwitchSceneActionEvent;
import database.UserSignin;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class UserSigninC {
	SwitchSceneActionEvent goTo = new SwitchSceneActionEvent();
	UserSignin userSignin = new UserSignin();
	
	@FXML 
	private TextField txtContactNo, txtPassword;
	
	public void switchToUserSignup(ActionEvent event) throws IOException {
		goTo.switchScene(event, "/fxml/UserSignup.fxml","User Signup Section");
	}
	
	public void switchToUserDashboard(ActionEvent event) throws IOException {
		String contactNo = txtContactNo.getText();
		String password = txtPassword.getText();
		userSignin.getUserData(contactNo);
		
		if(password.equals(userSignin.password))
			goTo.switchScene(event, "/fxml/UserDashboard.fxml","User Dashboard Section");
		else
			JOptionPane.showMessageDialog(null, "Incorrect Password!(Temporary Prompt)");
	}
}
