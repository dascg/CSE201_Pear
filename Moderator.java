
public class Moderator extends User {
	
	public Moderator(){
		
	}
	
	public boolean deleteComment(Comment c) {
		return false;
	}
	
	public boolean deleteApp(Application a) {
		return false;
	}

}
