package Models;

import java.util.ArrayList;

public class storeModel {
	ArrayList<UserModel> globalUserList = new ArrayList<UserModel>();
	ArrayList<PostModel> globalPostList = new ArrayList<PostModel>();
	
	public storeModel()
	{
	}
	
	public void addUser(UserModel newUser)
	{
		globalUserList.add(newUser);
	}
	
	public void addPost(PostModel newPost)
	{
		globalPostList.add(newPost);
	}
}
