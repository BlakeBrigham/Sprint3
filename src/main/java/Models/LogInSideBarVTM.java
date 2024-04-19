package Models;

import java.io.IOException;

import Views.EditController;
import Views.SidebarController;
import Views.UserPageController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;

public class LogInSideBarVTM implements LogInSideBarVTMInterface {

	BorderPane mainview;
	
	public LogInSideBarVTM(BorderPane view)
	{
		mainview = view;
	}
	

	@Override
	public void showHomePageView()
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(LogInSideBarVTM.class
				.getResource("../Views/HomePageView.fxml"));
		try
		{
			Node view = loader.load();
			mainview.setCenter(view);
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void showHomeView()
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(LogInSideBarVTM.class
				.getResource("../Views/HomeView.fxml"));
		try
		{
			Node view = loader.load();
			mainview.setCenter(view);
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void showSidebarView()
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(LogInSideBarVTM.class
				.getResource("../Views/SidebarView.fxml"));
		try
		{
			Node view = loader.load();
			mainview.setLeft(view);
			SidebarController cont = loader.getController();
			cont.setModel(this);
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		showUserPageView();

	}


	@Override
	public void showUserPageView()
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(LogInSideBarVTM.class
				.getResource("../Views/UserPageView.fxml"));
		try
		{
			Node view = loader.load();
			mainview.setCenter(view);
			UserPageController cont = loader.getController();
			UserModel user = new UserModel("Sarah", "Developer", "Amaazon", "Another code monkey");
			cont.setModel(this, user);
			cont.fillUserPage();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	@Override
	public void showLoginView()
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(LogInSideBarVTM.class
				.getResource("../Views/LoginView.fxml"));
		try
		{
			Node view = loader.load();
			mainview.setCenter(view);
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
    @FXML
    public void showEditView()
    {
    	System.out.println("In the edit");
    	FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(LogInSideBarVTM.class
    			.getResource("../Views/EditPage.fxml"));
    	
    	try
    	{
    		Node view = loader.load();
    		mainview.setCenter(view);
    		//EditController cont = loader.getController();
    		//cont.setModel(this);
    	} catch(IOException e)
    	{
    		e.printStackTrace();
    	}
    }
    
    
	
	/**
	 * 
	 * USER PAGE TRANSITIONS!!!!!
	 */
	@Override
	public void showUserFollowers()
	{
		System.out.println("Got it boss, showing followers!");
	}

	
	
	
}
