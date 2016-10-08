public class Budget {
	private double totalAmount;
	private Category[] categories;
	private int budgetType;
	
	public Budget(double totalAmount, Category[] categories, int budgetType) {
		// add error case for budgetType later
		if (totalAmount < 0 || categories == null) {
			throw new IllegalArgumentException();
		}
		this.setTotalAmount(totalAmount);
		this.setCategories(categories);
		this.setBudgetType(budgetType);
	}
	
	public double getTotalAmount() {
		return totalAmount;
	}
	
	public void setTotalAmount(double totalAmount) {
		if (totalAmount < 0) {
			throw new IllegalArgumentException();
		}
		this.totalAmount = totalAmount;
	}
	
	public Category[] getCategories() {
		return categories;
	}
	
	public void setCategories(Category[] categories) {
		if (categories == null) {
			throw new IllegalArgumentException();
		}
		this.categories = categories;
	}
	
	public int getBudgetType() {
		return budgetType;
	}
	
	public void setBudgetType(int budgetType) {
		/*if () {
			throw new IllegalArgumentException();
		}*/
		this.budgetType = budgetType;
	}
}
