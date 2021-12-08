package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class DevlopersDetails {
	@FXML
	private AnchorPane rootPane4;
	
	@FXML
	private Button button;

	@FXML
	private void loadMainpage(ActionEvent event) throws IOException
	{
		AnchorPane pane4 = (AnchorPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
		rootPane4.getChildren().setAll(pane4);
	}

}
