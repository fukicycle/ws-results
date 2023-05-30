package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class MainController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<?, ?> competitionColumn;

    @FXML
    private TableColumn<?, ?> competitorColumn;

    @FXML
    private TableColumn<?, ?> medalColumn;

    @FXML
    private TableColumn<?, ?> memberColumn;

    @FXML
    private TableColumn<?, ?> rankColumn;

    @FXML
    private TableColumn<?, ?> resultColumn;

    @FXML
    private TableColumn<?, ?> skillColumn;

    @FXML
    private TableView<?> tableView1;

    @FXML
    void initialize() {
        assert competitionColumn != null : "fx:id=\"competitionColumn\" was not injected: check your FXML file 'Main.fxml'.";
        assert competitorColumn != null : "fx:id=\"competitorColumn\" was not injected: check your FXML file 'Main.fxml'.";
        assert medalColumn != null : "fx:id=\"medalColumn\" was not injected: check your FXML file 'Main.fxml'.";
        assert memberColumn != null : "fx:id=\"memberColumn\" was not injected: check your FXML file 'Main.fxml'.";
        assert rankColumn != null : "fx:id=\"rankColumn\" was not injected: check your FXML file 'Main.fxml'.";
        assert resultColumn != null : "fx:id=\"resultColumn\" was not injected: check your FXML file 'Main.fxml'.";
        assert skillColumn != null : "fx:id=\"skillColumn\" was not injected: check your FXML file 'Main.fxml'.";
        assert tableView1 != null : "fx:id=\"tableView1\" was not injected: check your FXML file 'Main.fxml'.";

    }

}
