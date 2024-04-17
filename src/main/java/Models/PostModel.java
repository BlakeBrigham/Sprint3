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
}
