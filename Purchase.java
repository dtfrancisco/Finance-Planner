import java.time.LocalDateTime;

public class Purchase {
	private double amount;
	private LocalDateTime time;
	private String name;
	//USA Format: City name, City state, World: City name, Country name
	private String location; 
	
	public Purchase(double amount, LocalDateTime time, String name, String location) {
		
		if (amount < 0 || time == null || name == null || location == null) {
			throw new IllegalArgumentException();
		}
		this.setAmount(amount);
		this.setTime(time);
		this.setName(name);
		this.setLocation(location);
	}
	public double getAmount() {
		return amount;
	}
	
	public void setAmount(double amount) {
		if (amount < 0) {
			throw new IllegalArgumentException();
		}
		this.amount = amount;
	}
	
	public LocalDateTime getTime() {
		return time;
	}
	
	public void setTime(LocalDateTime time) {
		if (time == null) {
			throw new IllegalArgumentException();
		}
		this.time = time;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException();
		}
		this.name = name;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		if (location == null) {
			throw new IllegalArgumentException();
		}
		this.location = location;
	}
}
