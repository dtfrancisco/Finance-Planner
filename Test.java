import java.time.LocalDateTime;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		testPurchaseCreation();
		//testPurchaseErrorCases();
		//TODO: Create budgets first
		testBudgetCreation();
		Account a = testAcctCreation();
		testAcctErrorCases(a);
		//testBudgetErrorCases();
		testCategoryCreation();
		//testCategoryErrorCases();
		//LocalDateTime time = LocalDateTime.now();
		//System.out.println(time);
	}

	private static void testPurchaseCreation() {
		// TODO Auto-generated method stub
		
	}

	private static void testCategoryCreation() {
		// TODO Auto-generated method stub
		
	}

	private static void testBudgetCreation(ArrayList <Purchase> purchases) {
		String name = "Savings";
		double amount = 14.54;
		ArrayList <Category> categories = new ArrayList <Category> ();
		int budgetType = 2;
		Budget budget = new Budget(name, budgetType, amount, categories, purchases);
		assert(budget != null):"Budget not properly created";
	}

	private static void testAcctErrorCases(Account a) {
		try {
		  a.setBudgets(null);
		} catch (Exception e) {
			assert(a.getBudgets() != null):"Budget not supposed to be null";
		}
	}
	
	private static Account testAcctCreation() {
		String name = "Joe";
		String email = "joe97@gmail.com";
		String password = "Iliketurtles";
		ArrayList <Budget> budgets = new ArrayList <Budget> ();
		ArrayList <Purchase> purchases = new ArrayList <Purchase> ();
		Account a = new Account(email, password, budgets, purchases);
		assert(a != null):"User using constructor 1 not properly created";
		Account b = new Account(name, email, password, budgets, purchases);
		assert(b != null):"User using constructor 2 not properly created";
		budgets = a.getBudgets();
		assert(budgets.size() == 3):"Improper budget initiating in Account";
		ArrayList <Budget> one = new ArrayList <Budget> ();
		Budget e = null;
		one.add(e);
		a.setBudgets(one);
		budgets = a.getBudgets();
		assert(budgets.size() == 1):"Account not properly clearing and adding new budgets";
		assert(a.getPurchases().size() == 0):"Default purchases case incorrect";
		return a;
	}

}
