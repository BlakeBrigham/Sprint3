package Models;

import java.util.ArrayList;

public class storeModel {
	private static storeModel single_instance = null;
	
	ArrayList<UserModel> globalUserList = new ArrayList<UserModel>();
	ArrayList<PostModel> globalPostList = new ArrayList<PostModel>();

	
	private storeModel()
	{
		/**
		ArrayList<UserModel> globalUserList = new ArrayList<UserModel>();
		ArrayList<PostModel> globalPostList = new ArrayList<PostModel>();
		**/
	}
	
	
    public static synchronized storeModel getInstance()
    {
        if (single_instance == null)
            single_instance = new storeModel();
 
        return single_instance;
    }
    
	public void addUser(UserModel newUser)
	{
		globalUserList.add(newUser);
	}
	
	public void addPost(PostModel newPost)
	{
		globalPostList.add(newPost);
	}

	public ArrayList<UserModel> getGlobalUserList() {
		return globalUserList;
	}

	public ArrayList<PostModel> getGlobalPostList() {
		return globalPostList;
	}
	
	
}
