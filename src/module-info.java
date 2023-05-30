module WSResults {
	requires javafx.controls;
	requires javafx.fxml;
	requires com.google.gson;
	requires javafx.base;
	requires javafx.graphics;
	requires java.desktop;
	
	opens application to javafx.graphics, javafx.fxml;
	opens application.Entities to com.google.gson, javafx.base;
}
