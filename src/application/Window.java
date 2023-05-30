package application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Window {
	public static WindowBase create(String fxml,String title) {
		try {
			Stage stage = new Stage();
			var loader = new FXMLLoader(Window.class.getResource(fxml));
			Scene scene = new Scene(loader.load());
			WindowBase window = loader.getController();
			scene.getStylesheets().add(Window.class.getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.setTitle(title);
			window.setStage(stage);
			return window;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
