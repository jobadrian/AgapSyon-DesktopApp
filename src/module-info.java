module AgapSyon {
	requires javafx.controls;
	requires javafx.fxml;
	requires transitive javafx.base;
	requires java.sql;
	requires java.desktop;
	requires transitive javafx.graphics;
	
	opens main to javafx.graphics, javafx.fxml;
	
	opens controllers to javafx.fxml;
    exports controllers;
}
