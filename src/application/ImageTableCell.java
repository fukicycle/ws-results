package application;

import application.Entities.ResultView;
import javafx.application.Platform;
import javafx.scene.control.TableCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ImageTableCell extends TableCell<ResultView, String> {

	@Override
	protected void updateItem(String paramT, boolean paramBoolean) {
		// TODO 自動生成されたメソッド・スタブ
		super.updateItem(paramT, paramBoolean);
		new Thread() {
			public void run() {
				//Set up the ImageView
				final ImageView imageView = new ImageView();
				imageView.setFitHeight(80);
				imageView.setFitWidth(80);
				if (paramT != null && !paramT.isBlank()) {
					Image image = new Image(paramT, 160, 160, true, true);
					Platform.runLater(new Runnable() {
						@Override
						public void run() {
							imageView.setImage(image);
							setGraphic(imageView);
						}
					});
				}else {
					Platform.runLater(new Runnable() {
						@Override
						public void run() {
							setGraphic(imageView);
						}
					});
				}
			}
		}.start();
	}
}
