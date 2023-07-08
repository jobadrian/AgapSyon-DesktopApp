package controllers;

import java.io.IOException;

import components.SwitchSceneMouseEvent;
import javafx.scene.input.MouseEvent;

public class SafetyC {
    SwitchSceneMouseEvent goTo = new SwitchSceneMouseEvent();
    
    public void switchToUserDashboard(MouseEvent event) throws IOException {
        goTo.switchScene(event, "/fxml/UserDashboard.fxml","User Dashboard Section");
    }
    
    public void switchToSafety(MouseEvent event) throws IOException {
        goTo.switchScene(event, "/fxml/Safety.fxml","Safety Status Section");
    }
    
    public void switchToGuides(MouseEvent event) throws IOException {
        goTo.switchScene(event, "/fxml/Guides.fxml","Guides Section");
    }
    
    public void switchToHotlines(MouseEvent event) throws IOException {
        goTo.switchScene(event, "/fxml/Hotlines.fxml","Hotlines Section");
    }
    
    public void switchToMaps(MouseEvent event) throws IOException {
        goTo.switchScene(event, "/fxml/Maps.fxml","Maps of Evaquation Centre Section");
    }
    
    //This is temporary might add confirmation later
    public void logout(MouseEvent event) throws IOException {
        goTo.switchScene(event, "/fxml/Main.fxml","Home Section");
    } 
}
