
public class Category {
	private String name;
	private double amountSpent;
	
	public Category(String name, double amountSpent) {
		if (name == null || amountSpent < 0) {
			throw new IllegalArgumentException();
		}
		this.setName(name);
		this.setAmountSpent(amountSpent);
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
	
	public double getAmountSpent() {
		return amountSpent;
	}
	
	public void setAmountSpent(double amountSpent) {
		if (amountSpent < 0) {
			throw new IllegalArgumentException();
		}
		this.amountSpent = amountSpent;
	}
}