package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SecondController {
	
	@FXML
    private Label lable;
	
	
	public void initialize(URL location,ResourceBundle resources)
	{
		
	}


	public  void myfunction(String text) {
		// TODO Auto-generated method stub
		
		lable.setText(text);
		
		
	}
}
