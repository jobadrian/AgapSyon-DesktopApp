package controllers;

import java.io.IOException;

import components.SwitchSceneMouseEvent;
import javafx.scene.input.MouseEvent;

public class TyphoonGuideC {
	 SwitchSceneMouseEvent goTo = new SwitchSceneMouseEvent();
	    
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
	    
	    public void viewTyphoonGuide(MouseEvent event) throws IOException{
	    	goTo.switchScene(event, "/fxml/TyphoonGuide.fxml","Typhoon Guide");
	    }
	    
	    public void viewTsunamiGuide(MouseEvent event) throws IOException{
	    	goTo.switchScene(event, "/fxml/TsunamiGuide.fxml","Tsunami Guide");
	    }
	    
	    public void viewLandslideGuide(MouseEvent event) throws IOException{
	    	goTo.switchScene(event, "/fxml/LandslideGuide.fxml","Landslide Guide");
	    }
	    
	    public void viewVulcanicEruptionGuide(MouseEvent event) throws IOException{
	    	goTo.switchScene(event, "/fxml/VulcanicEruptionGuide.fxml","Vulcanic Eruption Guide");
	    }
	    
	    public void viewFireSafetyGuide(MouseEvent event) throws IOException{
	    	goTo.switchScene(event, "/fxml/FireSafetyGuide.fxml","Vulcanic Eruption Guide");
	    }
	    
	    public void viewEarthquakeGuide(MouseEvent event) throws IOException{
	    	goTo.switchScene(event, "/fxml/EarthquakeGuide.fxml","Earthquake Guide");
	    }
	    
	    public void exit(MouseEvent event) throws IOException{
	    	goTo.switchScene(event, "/fxml/Guides.fxml","Guides");
	    }
}
