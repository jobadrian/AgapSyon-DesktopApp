package components;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SwitchSceneActionEvent {
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void switchScene(ActionEvent event, String temp, String title) throws IOException {
		root = FXMLLoader.load(getClass().getResource(temp));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setTitle(title);
		stage.setScene(scene);
		stage.show();
	}
}
