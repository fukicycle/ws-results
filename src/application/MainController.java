package application;

import java.net.URL;
import java.util.ResourceBundle;

import application.Entities.Medal;
import application.Entities.Result;
import application.Entities.ResultView;
import application.Entities.WSResult;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;

public class MainController extends WindowBase {
	private ObservableList<ResultView> resultViews = FXCollections.observableArrayList();

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private TableColumn<ResultView, String> iconColumn;

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
	private Label statusLabel;

	@FXML
	private Button nextButton;

	@FXML
	private Button prevButton;

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
		rankColumn.setCellValueFactory(new PropertyValueFactory<ResultView, Integer>("rank"));
		medalColumn.setCellValueFactory(new PropertyValueFactory<ResultView, String>("medal"));
		competitorColumn
				.setCellValueFactory(new PropertyValueFactory<ResultView, String>("competitor"));
		resultColumn.setCellValueFactory(new PropertyValueFactory<ResultView, Double>("result"));
		competitionColumn
				.setCellValueFactory(new PropertyValueFactory<ResultView, String>("competition"));
		memberColumn.setCellValueFactory(new PropertyValueFactory<ResultView, String>("member"));
		skillColumn.setCellValueFactory(new PropertyValueFactory<ResultView, String>("skill"));
		iconColumn.setCellFactory(
				new Callback<TableColumn<ResultView, String>, TableCell<ResultView, String>>() {
					@Override
					public TableCell<ResultView, String> call(TableColumn<ResultView, String> param) {
						return new ImageTableCell();
					}
				});
		iconColumn.setCellValueFactory(new PropertyValueFactory<ResultView, String>("image"));
		move(true);
		nextButton.setOnAction(e -> move(true));
		prevButton.setOnAction(e -> move(false));

	}
	private int tableViewCount = 50;
	private int lastRank = 0;
	private int offset = -tableViewCount;
	private void move(boolean isNext) {
		resultViews.clear();
		statusLabel.setText("Loading ...");
		if (isNext) {
			offset = offset + tableViewCount;
			if (offset > 10431)
				offset = offset - tableViewCount;
		} else {
			offset = offset - tableViewCount;
			if (offset < 0)
				offset = 0;
		}
		// separate non-FX thread
		new Thread() {
			// runnable for that thread
			public void run() {
				try {
					WSResult wsResult = Api.getResults(offset, tableViewCount);
					int rank = lastRank + 1;
					String skill = "";
					for (Result result : wsResult.results) {
						String medalCode = "";
						Medal medal = result.getMedal();
						if (medal != null)
							medalCode = medal.getCode();
						String tmp = result.getSkill().getName().getText();
						if (!skill.equals(tmp) && medalCode.equals("GOLD")) {
							skill = tmp;
							rank = 1;
						}
						String url = "";
						application.Entities.Image image = result.getCompetitors().get(0).getImage();
						if (image != null)
							url = image.getThumbnail();
						resultViews.add(new ResultView(rank, medalCode,
								result.getCompetitors().get(0).getFirst_name() + " "
										+ result.getCompetitors().get(0).getLast_name(),
								result.getMark(), result.getSkill().getEvent().getName(),
								result.getMember().getName().getText(), skill, url));
						rank++;
					}
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				// update ProgressIndicator on FX thread
				Platform.runLater(new Runnable() {
					public void run() {
						tableView1.itemsProperty().setValue(resultViews);
						statusLabel.setText("Count:" + resultViews.size());
						lastRank = resultViews.get(resultViews.size() - 1).getRank();
					}
				});
			}
		}.start();
	}
}
