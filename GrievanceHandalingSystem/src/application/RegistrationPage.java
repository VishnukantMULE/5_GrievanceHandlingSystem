package application;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class RegistrationPage {
	@FXML
	private AnchorPane rootPane6;
	 
	
	  @FXML
	    private TextField txtfname;

	    @FXML
	    private TextField txtmname;

	    @FXML
	    private TextField txtlname;

	    @FXML
	    private TextField txtmnum;

	    @FXML
	    private TextField txteid;

	    @FXML
	    private TextField txtdob;
	    
	    @FXML
	    private TextField txtfno;

	    @FXML
	    private TextField txtbname;

	    @FXML
	    private TextField txtarea;

	    @FXML
	    private TextField txtcity;

	    @FXML
	    private TextField txtdistrict;

	    @FXML
	    private TextField txtpincode;

	    @FXML
	    private TextField txtstate;
	    
	    @FXML
	    private TextField txtpass;

	    @FXML
	    private TextField txtrenter;
	    
	    @FXML
	    private Label Lable;
	    
	    


	    
	    Connection con;
		PreparedStatement pat;

		private PreparedStatement pst;



	

	
	@FXML
	private void loadLoginPage(ActionEvent event) throws IOException
	{

		String firstname = txtfname.getText();		
		String middlename = txtmname.getText();
		String lastname = txtlname.getText();
		String mobnum = txtmnum.getText();
		String Email = txteid.getText();
		String dob = txtdob.getText();
		String flat = txtfno.getText();
		String building = txtbname.getText();
		String area = txtarea.getText();
		String city = txtcity.getText();
		String district = txtdistrict.getText();
		String pincode = txtpincode.getText();
		String state = txtstate.getText();
		String pass = txtpass.getText();
		String rpass = txtrenter.getText();

		
		
		
		
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/apsitregistration?characterEncoding=latin1","root","");
				
             	pst =con.prepareStatement("insert into personal_details(First_Name, Middle_Name, Last_Name, Mobile_Number, Email, DOB,Flat_Number,Building_Name,Area,City,District,Pincode,State,Password,ReEnter_Password) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
              
             	
			
             	
             	
             	
             	pst.setString(1,firstname);	
			    pst.setString(2,middlename);	
			    pst.setString(3,lastname);	
			    pst.setString(4,mobnum);
			    pst.setString(5,Email);	
			    pst.setString(6,dob);
			    pst.setString(7,flat);	
			    pst.setString(8,building);	
			    pst.setString(9,area);	
			    pst.setString(10,city);	
			    pst.setString(11,district);
			    pst.setString(12,pincode);	
			    pst.setString(13,state);
			    pst.setString(14,pass);
			    pst.setString(15,rpass);
			   
				
			   



			    int status =pst.executeUpdate();			    
	      if (status==15)
	      {

	  		
	  		txtfname.setText("");
	  		txtmname.setText("");
	  		txtlname.setText("");
	  		txtmnum.setText("");
	  		txteid.setText("");
	  		txtdob.setText("");
	  		txtfno.setText("");
	  		txtbname.setText("");
	  		txtarea.setText("");
	  		txtcity.setText("");
	  		txtdistrict.setText("");
	  		txtpincode.setText("");
	  		txtstate.setText("");
	  		txtpass.setText("");
	  		txtrenter.setText("");
	  		
	       

	  		
	      }
	
			

			try {
				Class.forName("com.mysql.jdbc.Driver");
				try {
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/apsitregistration?characterEncoding=latin1","root","");
	             	pst =con.prepareStatement("insert into g_detail(Email, Mobile_Number) values (?,?);");

				    pst.setString(1,Email);	
				    pst.setString(2,mobnum);

 

				    int stst =pst.executeUpdate();			    
		      if (stst==4)
		      {
			  		txteid.setText("");
			  		txtmnum.setText("");


		      
		      }
				    
			    
			    
	             	
	             	
	             	
	        	    
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
				
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} 	
	             	
	             	
	             	
	             	
	             	
			
			
			
			
			
			
			
			
			

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	             	
	             	
	             	
	             	
	             	
			    
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		if(pass.equals(rpass))
		{

		
		AnchorPane pane6 = (AnchorPane)FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
		rootPane6.getChildren().setAll(pane6);
		
		}
		
		else
		{
			Lable.setText("password doesnt match");
		}
		
		
		
	
		}


	
		
		

	

	
	
	@FXML
	private void loadHomePageBK(ActionEvent event) throws IOException
	{  
		AnchorPane pane6 = (AnchorPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
		rootPane6.getChildren().setAll(pane6);
	}
	
	
	
	
	
	

}




