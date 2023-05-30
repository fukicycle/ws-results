package application;

import javafx.stage.Modality;
import javafx.stage.Stage;

public abstract class WindowBase {
	protected Stage stage;
	public void setStage(Stage stage) {
		this.stage = stage;
	}
	
	public void show() {
		stage.show();
	}
	
	public void showDialog() {
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.showAndWait();
	}
	
	public void close() {
		stage.close();
	}
}
