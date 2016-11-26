
public class Category {
	//TODO: Later add monthly/annual/weekly goals
	private String name;
	private double amountSpent;
	
	public Category(String name, double amountSpent) {
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
	
	public String toString() {
		String rc = "";
		rc += "Category name : "+name;
		rc += "\nAmount Spent: "+amountSpent;
		return rc;
	}
}