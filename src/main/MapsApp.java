package main;

import controllers.MapsController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MapsApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load the FXML file
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MapsTemp.fxml"));
        Parent root = loader.load();

        // Get the controller
        MapsController controller = loader.getController();

        // Set up the primary stage
        primaryStage.setTitle("Google Maps in JavaFX");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();

        // Initialize the controller
        controller.initialize();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
