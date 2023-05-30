package application;
	
import javafx.application.Application;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Window.create("Main.fxml", "メイン画面").show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
