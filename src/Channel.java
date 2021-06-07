import java.util.ArrayList;

public class Channel implements Subject {
	
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	private String channelName = "";
	private String status = "";
	
	public Channel() {}
	
	public Channel(String channelName, String status) {
		this.channelName = channelName;
		this.status = status;
	}
	
	public String getChannelName() { return this.channelName; }
	
	public void setChannelName(String channelName) { this.channelName = channelName; }
	
	public String getStatus() { return this.status; }
	
	public void setStatus(String status) { 
		this.status = status;
		notifyObservers(); 
	}
	
	public void notifyObservers() {
		for(Observer observer : observers) {
			observer.update(this.getStatus());
		}
	}
	
	public void registerObserver(Observer observer) { this.observers.add(observer); }
	
	public void removeObserver(Observer observer) { this.observers.remove(observer); }
	
	

}
