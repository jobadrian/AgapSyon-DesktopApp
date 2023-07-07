module AgapSyon {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	requires transitive javafx.base;
	requires java.sql;
	requires java.desktop;
	
	opens main to javafx.graphics, javafx.fxml;
	
	opens controllers to javafx.fxml;
    exports controllers;
}
