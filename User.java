
public class User extends Guest {
	 
	public String username;
	public String password;
	public String email;
	
	public User(String username, String password, String email) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.ID = 1;
	}
	
	public boolean requestForm(Application a) {
		return false;
	}
	
	public boolean comment() {
		return false;
	}
	

}
