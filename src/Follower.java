
public class Follower implements Observer {
	private String followerName;
	
	public Follower() {}
	
	public Follower(String followerName) { this.followerName = followerName; }
	
	public String getFollowerName() { return this.followerName; }
	
	public void setFollowerName(String followerName) { this.followerName = followerName; }
	
	@Override
	public void update(String status) {
		// TODO Auto-generated method stub
		// Update followers about the channel status	
		
	}
	
	public void play() { 
		// play channel
	}
}
