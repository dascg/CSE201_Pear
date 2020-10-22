
public class User extends Guest {
	 
	public String username;
	public String password;
	public String email;
	//User constructor
	public User(String username, String password, String email) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.ID = 1;
	}
	//request to view application
	public boolean requestForm(Application a) {
		return false;
	}
	//method for leaving a comment
	public boolean comment() {
		return false;
	}
	

}
