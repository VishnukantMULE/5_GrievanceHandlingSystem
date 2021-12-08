package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class AdminDashbord {
	@FXML
	private AnchorPane rootPanea;
	
	@FXML
	private Button button;

	@FXML
	private void loadUserGrievances(ActionEvent event) throws IOException
	{
		AnchorPane panea = (AnchorPane)FXMLLoader.load(getClass().getResource("UserGrievances.fxml"));
		rootPanea.getChildren().setAll(panea);
    
	}
		@FXML
		private void loadAdminLogin(ActionEvent event) throws IOException
		{
			AnchorPane panea = (AnchorPane)FXMLLoader.load(getClass().getResource("AdminLogin.fxml"));
			rootPanea.getChildren().setAll(panea);
	}
		@FXML
		private void loadAdminHistory(ActionEvent event) throws IOException
		{
			AnchorPane panea = (AnchorPane)FXMLLoader.load(getClass().getResource("History.fxml"));
			rootPanea.getChildren().setAll(panea);
	}
}
