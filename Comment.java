
public class Comment {
  
  private int id;
  private String timestamp;
  private User user;
  
  public Comment(int id, String timestamp, User user) {
    this.id = id;
    this.timestamp = timestamp;
    this.user = user;
  }
  
  public boolean edit(String str) { }
  
  public boolean delete() { }
  
  public boolean flag(int id) { }

}
