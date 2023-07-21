package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import components.SwitchSceneMouseEvent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class MapC implements Initializable{
    SwitchSceneMouseEvent goTo = new SwitchSceneMouseEvent();
    @FXML 
	private WebView webView;
	private WebEngine engine;
	private String homePage;
	
	@FXML 
	private ChoiceBox<String> location;
	
	private String evacuationCenter[] = {"Libis Baesa Elementary School",
										 "Libis Baesa Evangelical Church",
										 "Brgy. 160 Multi-Purpose Hall",
										 "Fatima Chapel"};
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		location.getItems().addAll(evacuationCenter);
		location.setOnAction(this::getLocation);
		engine = webView.getEngine();
		engine.load("https://www.google.com/maps/place/160,+Caloocan,+Metro+Manila/@14.6802314,120.9973871,16z/data=!3m1!4b1!4m6!3m5!1s0x3397b6b0837e5d17:0x3614a95dcb16522d!8m2!3d14.6815796!4d121.000537!16s%2Fg%2F1td7qql0?hl=en&entry=ttu");
	} 
	
	public void getLocation(ActionEvent event) {
		String myLocation = location.getValue();
		if(myLocation.equalsIgnoreCase("Libis Baesa Elementary School"))
			homePage = "https://www.google.com/maps/place/Libis+Baesa+Elementary+School/@14.6821074,120.9975594,17z/data=!3m1!4b1!4m6!3m5!1s0x3397b795239a4543:0x80431c958e982b78!8m2!3d14.6821022!4d121.0001343!16s%2Fg%2F11hzzrph2c?hl=en&entry=ttu";
		else if(myLocation.equalsIgnoreCase("Libis Baesa Evangelical Church"))	
			homePage = "https://www.google.com/maps/place/Libis+Baesa+Evangelical+Church/@14.6832483,120.9974605,17z/data=!3m1!4b1!4m6!3m5!1s0x3397b75a972b31ab:0xb765ba476a1b339f!8m2!3d14.6832431!4d121.0000354!16s%2Fg%2F11lkx4l78n?hl=en&entry=ttu";
		else if(myLocation.equalsIgnoreCase("Brgy. 160 Multi-Purpose Hall"))	
			homePage = "https://www.google.com/maps/place/Brgy.+160+Multi-Purpose+Hall/@14.6825296,120.9977558,17z/data=!3m1!4b1!4m6!3m5!1s0x3397b6b0368ebeed:0xdc243950030e626a!8m2!3d14.6825244!4d121.0003307!16s%2Fg%2F11bz0bgql0?hl=en&entry=ttu";
		else
			homePage = "https://www.google.com/maps/place/Fatima+Chapel/@14.6829932,120.9977431,17z/data=!3m1!4b1!4m6!3m5!1s0x3397b6b1cb180afd:0xec4c2c62f8fa2324!8m2!3d14.682988!4d121.000318!16s%2Fg%2F11bw5x9_ss?hl=en&entry=ttu";
			
		engine.load(homePage);
	}
    
	 public void switchToUserDashboard(MouseEvent event) throws IOException {
	        goTo.switchScene(event, "/fxml/UserDashboard.fxml","User Dashboard");
	    }
	    
	    public void switchToSafety(MouseEvent event) throws IOException {
	        goTo.switchScene(event, "/fxml/Safety.fxml","Safety Status");
	    }
	    
	    public void switchToGuides(MouseEvent event) throws IOException {
	        goTo.switchScene(event, "/fxml/Guides.fxml","Guides");
	    }
	    
	    public void switchToHotlines(MouseEvent event) throws IOException {
	        goTo.switchScene(event, "/fxml/Hotlines.fxml","Hotlines");
	    }
	    
	    public void switchToMaps(MouseEvent event) throws IOException {
	        goTo.switchScene(event, "/fxml/Maps.fxml","Maps of Evaquation Centre");
	    }
	    
	    //This is temporary might add confirmation later
	    public void logout(MouseEvent event) throws IOException {
	        goTo.switchScene(event, "/fxml/Main.fxml","Home");
	    }
}
