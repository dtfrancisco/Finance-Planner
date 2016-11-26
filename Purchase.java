import java.time.LocalDateTime;

public class Purchase {
	private double amount;
	private LocalDateTime time;
	private String name;
	//USA Format: City name, City state, World: City name, Country name
	private String location; 
	private int budgetType;
	private String budgetName;
	private Category category; // needs a budget type and budget name assigned first
	
	//TODO: Change Category field to Category ArrayList field?
	public Purchase(double amount, LocalDateTime time, String name, 
			String location, int budgetType, String budgetName, Category category) {
		this(amount,time,name,location,budgetType,budgetName);
		this.setCategory(category);
	}
	
	
	public Purchase(double amount, LocalDateTime time, String name, 
			String location, int budgetType, String budgetName) {
		this(amount,time,name,location);
		this.setBudgetType(budgetType);
		this.setBudgetName(budgetName);
	}
	
	
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
	
	public int getBudgetType() {
		return budgetType;
	}


	public void setBudgetType(int budgetType) {
		//TODO: Set limits of budget types
		/*if (budgetType == null) {
			throw new IllegalArgumentException();
		}*/
		this.budgetType = budgetType;
	}


	public String getBudgetName() {
		return budgetName;
	}


	public void setBudgetName(String budgetName) {
		if (budgetName == null) {
		throw new IllegalArgumentException();
	    }
		this.budgetName = budgetName;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		if (category == null) {
		throw new IllegalArgumentException();
	    }
		
		this.category = category;
	}
	
	public String toString() {
		String rc = "";
		rc += "Purchase name : "+name;
		rc += "\nAmount: "+amount;
		rc += "\nLocation: "+location;
		rc += "\nTime: time";
		//TODO: Update if there's budget type, name, and category
		return rc;
	}
}
