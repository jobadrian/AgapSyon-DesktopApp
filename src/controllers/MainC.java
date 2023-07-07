package controllers;

import java.io.IOException;
import components.SwitchScene;
import javafx.event.ActionEvent;

public class MainC {
	SwitchScene goTo = new SwitchScene();
	
	public void switchToUserSignin(ActionEvent event) throws IOException {
		goTo.switchScene(event, "/fxml/UserSignin.fxml","User Login Section");
	}
	
	public void switchToAdminLogin(ActionEvent event) throws IOException {
		goTo.switchScene(event, "/fxml/AdminSignin.fxml","Admin Login Section");
	}
}
