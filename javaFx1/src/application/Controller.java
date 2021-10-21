package application;



import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class Controller {
	
	@FXML
	
	ImageView myImageView;
	Button myButon;
	
	Image myImage = new Image(getClass().getResourceAsStream("/pizza.png"));
	
	public void displayImage () {
		myImageView.setImage(myImage);
		
		
	}
	
	
	
	
	
	
	
}
