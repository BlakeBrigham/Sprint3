package Models;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class PostModel
{
	String content;
	int likes = 0;
	UserModel originalPoster;
	ArrayList<PostModel> comments = new ArrayList<PostModel>();
	ArrayList<UserModel> likers = new ArrayList<UserModel>();
	final LocalDateTime creationDateTime;
	
	/**
	 * @param content
	 * @param likes
	 * @param originalPoster
	 */
	protected PostModel(String content, UserModel originalPoster)
	{
		this.content = content;
		this.originalPoster = originalPoster;
		this.creationDateTime = LocalDateTime.now();
	}
	
	protected void changeLikes(UserModel liker, boolean isIncrease)
	{
		if (!likers.contains(liker))
		{
			this.likes++;
			this.likers.add(liker);
		}
		else
		{
			this.likes--;
			this.likers.remove(liker);
		}
	}
	
	public String getContent()
	{
		return this.content;
	}
	
	public int getLikes()
	{
		return this.likes;
	}
	
	public UserModel getOP()
	{
		return this.originalPoster;
	}
	
	public ArrayList<PostModel> getComments()
	{
		return this.comments;
	}
	
	public String getDatePosted()
	{
		return this.creationDateTime.toString();
	}
	
	public ArrayList<UserModel> getLikers()
	{
		return this.likers;
	}
}
