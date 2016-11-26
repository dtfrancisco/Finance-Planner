import java.util.ArrayList;

// may add more optional fields: phone #, zip code, state/country
public class Account {
	private String name; //optional
	private String email;
	private String password;
	private ArrayList <Budget> budgets;
	private ArrayList <Purchase> purchases;

	public Account(String name, String email, String password, 
			ArrayList <Budget> budgets, ArrayList <Purchase> purchases) {
		this(email, password, budgets, purchases);
		this.setName(name);
	}

	public Account(String email, String password, ArrayList <Budget> budgets
			, ArrayList <Purchase> purchases) {
		this.setEmail(email);
		this.setPassword(password);
		if (budgets.size() == 0) {
			this.budgets = new ArrayList <Budget> ();
		}
		this.setBudgets(budgets);

		if (purchases.size() == 0) {
			this.purchases = new ArrayList <Purchase> ();
		}
		this.setPurchases(purchases);
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
		//TODO: Add safety later once email is implemented
		if (password == null) {
			throw new IllegalArgumentException();
		}
		this.password = password;
	}

	public ArrayList<Budget> getBudgets() {
		return budgets;
	}

	public void setBudgets(ArrayList<Budget> budgets) {
		if (budgets == null) {
			throw new IllegalArgumentException();
		}
		else if (budgets.size() == 0) {
			ArrayList <Category> categories = new ArrayList <Category> ();
			//TODO: Change this later
			Budget fixed = new Budget("fixed", 0, 0, categories, purchases);
			Budget disposable = new Budget("disposable", 1, 0, categories, purchases);
			Budget savings = new Budget("savings", 2, 0, categories, purchases);
			this.budgets.add(fixed);
			this.budgets.add(disposable);
			this.budgets.add(savings);			
		}
		else {
			this.budgets = budgets;
		}
	}

	public ArrayList<Purchase> getPurchases() {
		return purchases;
	}

	public void setPurchases(ArrayList<Purchase> purchases) {
		if (purchases == null) {
			throw new IllegalArgumentException();
		}
		this.purchases = purchases;
	}
	
	public String toString() {
		String rc = "";
		if (name != null) {
		  rc += "Account name : "+name;
		}
		rc += "\nEmail address: "+email;
		// might want to hide this later
		rc += "\nPassword: "+password;
		
		System.out.println();
		
		for (int i = 0; i < budgets.size(); i++) {
			rc += "Budget"+i+" : "+budgets.get(i).getName();
		}
		
		System.out.println();
		
		for (int i = 0; i < purchases.size(); i++) {
			rc += "Purchase"+i+" : "+purchases.get(i).getName();
		}

		return rc;
	}
}
