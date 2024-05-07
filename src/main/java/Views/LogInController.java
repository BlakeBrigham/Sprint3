package Views;


import Models.LogInSideBarVTMInterface;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class LogInController {

	LogInSideBarVTMInterface model;
	
	@FXML
	ImageView myImageView;
	Image myImage = new Image(getClass().getResourceAsStream("img/icons/account_circle.png"));
	
/*
	String imgPath = "img/icons/account_circle.png";
	//Image image = loadImage();
	
	Image image = new Image(Main.class.getResource(imgPath).toExternalForm());
	testImage.setImage(image);
	*/
	
	public void displayImage()
	{
		myImageView.setImage(myImage);
	}
	
	public void setModel(LogInSideBarVTMInterface newModel)
	{
		model = newModel;
	}
	
	@FXML
    void OnClickLogin(ActionEvent event) {
		//model.showSidebarView();
		
		System.out.println("Login clicked");
    }
	
}
