package Views;


import Models.LogInSideBarVTMInterface;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class SidebarController {

	LogInSideBarVTMInterface model;
	
	public void setModel(LogInSideBarVTMInterface newModel)
	{
		model = newModel;
	}
	
	/**
	@FXML 
	void showUserPage()
	{
		model.showUserPageView();
	}
	
	**/
	
	@FXML
	void onClickHome(ActionEvent event)
	{
		System.out.println("Home clicked");
		model.showHomePageView();
		
	}
	
	@FXML
	void onClickFeed(ActionEvent event)
	{
		System.out.println("Profile clicked");
		
	}
	
	@FXML
	void onClickProfile(ActionEvent event)
	{
		System.out.println("Profile clicked");
		model.showUserPageView();
	}
	
	
}
