
public class Account {
	private String name; //optional
	private String email;
	private String password;
	private Budget[] budgets; // change to ArrayList?
	// private Purchase[] purchases?
	
	public Account(String name, String email, String password, 
			Budget[] budgets) {
		
		this(email, password, budgets);
		if (name == null) {
			throw new IllegalArgumentException();
		}
		this.setName(name);
	}
	
	public Account(String email, String password, Budget[] budgets) {
		if (email == null || password == null || budgets == null) {
			throw new IllegalArgumentException();
		}
		this.setEmail(email);
		this.setPassword(password);
		if (budgets.length == 0) {
			//set default budgets I suppose (disposable, fixed, savings);
		}
		else {
			this.setBudgets(budgets);
		}
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email == null) {
			throw new IllegalArgumentException();
		}
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if (password == null) {
			throw new IllegalArgumentException();
		}
		this.password = password;
	}

	public Budget[] getBudgets() {
		return budgets;
	}

	public void setBudgets(Budget[] budgets) {
		if (budgets == null) {
			throw new IllegalArgumentException();
		}
		this.budgets = budgets;
	}
}
