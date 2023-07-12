package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import components.CurrentUser;
import components.SwitchSceneMouseEvent;
import database.Weather;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class UserDashboardC implements Initializable{
    SwitchSceneMouseEvent goTo = new SwitchSceneMouseEvent();
    Weather weather = new Weather();
    @FXML
    Label lblGreet, lblDate, lblTemperature, lblCondition, lblPrecipitation, lblHangin, lblHalumigmig;
    
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

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		lblGreet.setText("Hello! "+CurrentUser.currentUser);
		weather.getWeatherUpdates();
		lblDate.setText(weather.date);
		lblTemperature.setText(weather.temperature);
		lblCondition.setText(weather.condition);
		lblPrecipitation.setText(weather.precipitation);
		lblHangin.setText(weather.hangin);
		lblHalumigmig.setText(weather.halumigmig);
	} 
    
    
}
