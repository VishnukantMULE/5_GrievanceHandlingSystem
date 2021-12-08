package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;




public class UserDashbord implements Initializable
{

	    @FXML
	    private AnchorPane rootPane5;	
	    
		@FXML
		private Button button;

		
	   
	   @FXML
	   public Label firstname;
	    
//	    
//	    private String Username;
//	    UserDashbord(String UserName)
//	    {
//	    	
//
//	    	
//	    	this.Username=UserName;
//	    	firstname.setText("sdfghjk");
//	    	firstname.setText(UserName);
//	    }
//	  
//	    
	   
	



		public void setvalue(String a) 
		{
			

			String faname=a;
			
            System.out.println(faname);
            
	   		firstname.setText(faname);
	   		
	   		refresh(faname);
	   		
		}
		
		

private void refresh(String faname) {
	// TODO Auto-generated method stub
    System.out.println(faname);

		firstname.setText(faname);

	
}



@FXML
private void loadPersonalDetails(ActionEvent event) throws IOException
{

	
		AnchorPane pane5 = (AnchorPane)FXMLLoader.load(getClass().getResource("UserPersonalDetails.fxml"));
		rootPane5.getChildren().setAll(pane5);
		}


		@FXML
		private void loadYourGrievance(ActionEvent event) throws IOException
		{
		AnchorPane pane5 = (AnchorPane)FXMLLoader.load(getClass().getResource("YourGrievance.fxml"));
		rootPane5.getChildren().setAll(pane5);

		}
		@FXML
		private void loadNewGrievance(ActionEvent event) throws IOException
		{
		AnchorPane pane5 = (AnchorPane)FXMLLoader.load(getClass().getResource("AddGrievance.fxml"));
		rootPane5.getChildren().setAll(pane5);
		}

		@FXML
		private void loadLoginPageBK(ActionEvent event) throws IOException
		{
		AnchorPane pane5 = (AnchorPane)FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
		rootPane5.getChildren().setAll(pane5);
		}

		@FXML
		private void loadSamplePageLG(ActionEvent event) throws IOException
		{
		AnchorPane pane5 = (AnchorPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
		rootPane5.getChildren().setAll(pane5);
		}



		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
			
		}



		

	   
		


	
}
		
	
		
		
	
		
		
	
	
	





