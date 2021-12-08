package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class SampleController {
	@FXML
	private AnchorPane rootPane;
	
	@FXML
	private Button button;
	
	
	@FXML
	private void loadSecond(ActionEvent event) throws IOException
	{
		AnchorPane pane = (AnchorPane)FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
		rootPane.getChildren().setAll(pane);
	}
	                                                                  

	@FXML
	private void handleButtonAction(ActionEvent event) throws IOException
	{  
		AnchorPane pane = (AnchorPane)FXMLLoader.load(getClass().getResource("RegistrationPage.fxml"));
		rootPane.getChildren().setAll(pane);
	}
	

	@FXML
	private void loadAdminPage(ActionEvent event) throws IOException
	{  
		AnchorPane pane = (AnchorPane)FXMLLoader.load(getClass().getResource("AdminLogin.fxml"));
		rootPane.getChildren().setAll(pane);
	}
	
	@FXML
	private void loadDevloperPage(ActionEvent event) throws IOException
	{
		AnchorPane pane = (AnchorPane)FXMLLoader.load(getClass().getResource("DevlopersDetails.fxml"));
		rootPane.getChildren().setAll(pane);
	}
}
