package controllers;

import java.io.IOException;
import components.SwitchSceneActionEvent;
import javafx.event.ActionEvent;

public class MainC {
	SwitchSceneActionEvent goTo = new SwitchSceneActionEvent();
	
	public void switchToUserSignin(ActionEvent event) throws IOException {
		goTo.switchScene(event, "/fxml/UserSignin.fxml","User Login");
	}
	
	public void switchToAdminLogin(ActionEvent event) throws IOException {
		goTo.switchScene(event, "/fxml/AdminSignin.fxml","Admin Login");
	}
}
