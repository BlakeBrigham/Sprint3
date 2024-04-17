package Views;

import Models.LogInSideBarVTMInterface;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import Models.UserModel;


public class UserPageController
{
	LogInSideBarVTMInterface vtm;
	UserModel user;
	
	public void setModel(LogInSideBarVTMInterface vtm, UserModel user)
	{
		this.vtm = vtm;
		this.user = user;
	}
	
	
	@FXML
	private Label UserPageViewName;
	@FXML
	private Label UserPageViewJobTitle;
	@FXML
	private Label UserPageDescription;
	
	@FXML
	private ListView<String> UserPageContentList;
	
	@FXML
	public void fillUserPage()
	{
		UserPageViewName.setText(user.getDisplayName());
		String employment = (user.getJob() + "@" + user.getCompany());
		
		UserPageViewJobTitle.setText(employment);
		
		//Sample data for posts
		user.addPost("I'm starting a new job today!");
		user.addPost("I got fired today!");
		user.addPost("I'm joining a rebel group today!");
		user.addPost("I'm becoming an artist today!");
		
		
		//Sample data for followers
		user.toggleFollower(new UserModel("Jimmy John", "", "", ""));
		user.toggleFollower(new UserModel("Captain John", "", "", ""));
		user.toggleFollower(new UserModel("Millard Filmore", "", "", ""));
		user.toggleFollower(new UserModel("Tsai Ing-wen", "", "", ""));
		UserPageContentList.setItems(user.getPosts());
		
		//Sample data for following
		user.toggleFollowing(new UserModel("Bill Clinton", "", "", ""));
		user.toggleFollowing(new UserModel("Pompia Sciceronicus", "", "", ""));
		user.toggleFollowing(new UserModel("Teresa Deng", "", "", ""));
		user.toggleFollowing(new UserModel("Calvin Hobbes", "", "", ""));
		user.toggleFollowing(new UserModel("Mr. President", "", "", ""));
		
		//Sample description
		user.setDescription("Hi there! You may not know this, but I am actually \"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");

	}
	
    @FXML
    private Button UserPageViewFollowersButton;
    
    
    /*
     * This is crude, but it will be better in the future, since 
     * we can have the lists hold structures, which can also hold
     * all of our subclasses
     */
    @FXML
    public void onClickViewFollowers(ActionEvent action)
    {
    	ObservableList<String> followerNames = FXCollections.observableArrayList();
    	for (UserModel follower : user.getFollowers())
    	{
    		followerNames.add(follower.getDisplayName());
    	}
    	
    	UserPageContentList.setItems(followerNames);
    }
	 
   
    @FXML
    public void onClickViewFollowing(ActionEvent action)
    {
    	ObservableList<String> followingNames = FXCollections.observableArrayList();
    	for (UserModel followee : user.getFollowing())
    	{
    		followingNames.add(followee.getDisplayName());
    	}
    	
    	UserPageContentList.setItems(followingNames);
    }
	
    @FXML
    public void onClickViewPosts(ActionEvent action)
    {    	
    	UserPageContentList.setItems(user.getPosts());
    }
    
    @FXML
    public void onClickViewDescription(ActionEvent action)
    {
    	
    	ObservableList<String> description = FXCollections.observableArrayList();
    	description.add(user.getDescription());
    	UserPageContentList.setItems(description);
    }
    
    @FXML
    public void onClickViewJobs(ActionEvent action)
    {
    	//vtm.showUserWorkHistory();
    }
    
    
    /**
	@FXML
    private ListView<?> UserPageViewContentList;
	{
		vtm.
	}

    @FXML
    private Button UserPageViewDescButton;

    @FXML
    private Button UserPageViewEditButton;

    @FXML
    private Button UserPageViewFollowButton;



    @FXML
    private Button UserPageViewFollowingButton;

    @FXML
    private Button UserPageViewJobsButton;

    @FXML
    private Button UserPageViewPostsButton;
	**/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	@FXML 
	void showUserPage()
	{
		model.showUserPageView();
	}
	
	@FXML
	void onClickHome(ActionEvent event)
	{
		System.out.println("Home clicked");
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
	}
	
	**/
	
	
}
