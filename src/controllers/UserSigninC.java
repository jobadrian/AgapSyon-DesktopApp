package controllers;

import java.io.IOException;

import components.SwitchScene;
import javafx.event.ActionEvent;

public class UserSigninC {
	SwitchScene goTo = new SwitchScene();
	
	public void switchToUserSignup(ActionEvent event) throws IOException {
		goTo.switchScene(event, "/fxml/UserSignup.fxml","User Signup Section");
	}
	
	public void switchToUserDashboard(ActionEvent event) throws IOException {
		goTo.switchScene(event, "/fxml/UserDashboard.fxml","User Dashboard Section");
	}
}
