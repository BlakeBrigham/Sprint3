package Models;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class UserModel
{


	public String displayName;
	public String job;
	public String company;
	String description;
	ObservableList<UserModel> following =FXCollections.observableArrayList();
	ObservableList<UserModel> followers = FXCollections.observableArrayList();
	ObservableList<String> posts = FXCollections.observableArrayList();
	
	/**
	 * @param displayName
	 * @param job
	 * @param company
	 */
	public UserModel(String displayName, String job, String company, String description)
	{
		this.displayName = displayName;
		this.job = job;
		this.company = company;
		this.description = description;
	}
	
	
	/**
	 * Setters and getters.
	 */
	public void addPost(String content) {
		this.posts.add(content);
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	//This is awesomely hacky. Basically, our description is a single
	//entry in a list, which requires doing violence to the typing of
	//the description.
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ObservableList<UserModel> getFollowing() {
		return following;
	}

	public void toggleFollowing(UserModel user)
	{
		if (this.following.contains(user))
		{
			this.following.remove(user);
		}
		else
		{
			this.following.add(user);
		}
	}

	public ObservableList<UserModel> getFollowers() {
		return followers;
	}

	
	public void toggleFollower(UserModel user)
	{
		if (this.followers.contains(user))
		{
			this.followers.remove(user);
		}
		else
		{
			this.followers.add(user);
		}
	}

	public ObservableList<String> getPosts() {
		return posts;
	}
}
