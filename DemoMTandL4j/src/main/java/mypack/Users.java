package mypack;

public class Users {
	private String username;
	private String password;
	
	public Users(String Usrname,String Psswrd)
	{
		username=Usrname;
		password=Psswrd;
		System.out.println("User Param Constructor");
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