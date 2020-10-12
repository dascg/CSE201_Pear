
public class User extends Guest {
	 
	private String username;
	private String password;
	private String email;
	
	public User() {
		
	}
	
	public boolean requestForm(Application a) {
		return false;
	}
	
	public boolean comment() {
		return false;
	}

}
