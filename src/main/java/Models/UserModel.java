package Models;

import java.util.ArrayList;

public class UserModel
{
	public String displayName;
	public String job;
	public String company;
	public String description;
	ArrayList<UserModel> following = new ArrayList<UserModel>();
	ArrayList<UserModel> followers = new ArrayList<UserModel>();
	
	/**
	 * @param displayName
	 * @param job
	 * @param company
	 */
	protected UserModel(String displayName, String job, String company, String description)
	{
		this.displayName = displayName;
		this.job = job;
		this.company = company;
		this.description = description;
	}

	
}
