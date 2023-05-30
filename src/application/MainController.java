package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Entities.Medal;
import application.Entities.Result;
import application.Entities.ResultView;
import application.Entities.WSResult;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class MainController extends WindowBase {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<ResultView, String> competitionColumn;

    @FXML
    private TableColumn<ResultView, String> competitorColumn;

    @FXML
    private TableColumn<ResultView, String> medalColumn;

    @FXML
    private TableColumn<ResultView, String> memberColumn;

    @FXML
    private TableColumn<ResultView, Integer> rankColumn;

    @FXML
    private TableColumn<ResultView, Double> resultColumn;

    @FXML
    private TableColumn<ResultView, String> skillColumn;

    @FXML
    private TableView<ResultView> tableView1;

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
        try {
			WSResult wsResult = Api.getResults();
			ObservableList<ResultView> resultViews = FXCollections.observableArrayList();
			for (Result result : wsResult.results) {
				String medalCode = "";
				Medal medal = result.getMedal();
				if(medal != null) medalCode = medal.getCode(); 
				resultViews.add(new ResultView(0, medalCode,result.getCompetitors().get(0).getFirst_name() + " " +  result.getCompetitors().get(0).getLast_name(), result.getMark(), result.getSkill().getEvent().getName(), result.getMember().getName().getText(), result.getSkill().getName().getText()));
			}
			rankColumn.setCellValueFactory(new PropertyValueFactory<ResultView, Integer>("rank"));
			medalColumn.setCellValueFactory(new PropertyValueFactory<ResultView, String>("medal"));
			competitorColumn.setCellValueFactory(new PropertyValueFactory<ResultView, String>("competitor"));
			resultColumn.setCellValueFactory(new PropertyValueFactory<ResultView, Double>("result"));
			competitionColumn.setCellValueFactory(new PropertyValueFactory<ResultView, String>("competition"));
			memberColumn.setCellValueFactory(new PropertyValueFactory<ResultView, String>("member"));
			skillColumn.setCellValueFactory(new PropertyValueFactory<ResultView, String>("skill"));
			tableView1.itemsProperty().setValue(resultViews);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

}
