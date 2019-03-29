package mypack;


/**
 * the User class 
 *
 */

public class Users {
	private String username;
	private String password;
	
	public Users(String Usrname,String Psswrd)
	{
		System.out.println("Param construtor of User class");
		username=Usrname;
		password=Psswrd;
	}
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}