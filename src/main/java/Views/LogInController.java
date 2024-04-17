package Views;


import Models.LogInSideBarVTMInterface;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class LogInController {

	LogInSideBarVTMInterface model;
	
	public void setModel(LogInSideBarVTMInterface newModel)
	{
		model = newModel;
	}
	
	@FXML
    void OnClickLogin(ActionEvent event) {
		model.showSidebarView();
		
		System.out.println("Login clicked");
    }
	
}
