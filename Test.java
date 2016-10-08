import java.time.LocalDateTime;

public class Test {

	public static void main(String[] args) {
		testAcctCreation();
		//testAcctErrorCases();
		testBudgetCreation();
		//testBudgetErrorCases();
		testCategoryCreation();
		//testCategoryErrorCases();
		testPurchaseCreation();
		//testPurchaseErrorCases();
		LocalDateTime time = LocalDateTime.now();
		System.out.println(time);
	}

	private static void testPurchaseCreation() {
		// TODO Auto-generated method stub
		
	}

	private static void testCategoryCreation() {
		// TODO Auto-generated method stub
		
	}

	private static void testBudgetCreation() {
		double amount = 14.54;
		Category[] categories = new Category[1];
		int budgetType = 0;
		Budget budget = new Budget(amount, categories, budgetType);
		System.out.println(budget.getTotalAmount());
		System.out.println(budget.getCategories());
		System.out.println(budget.getBudgetType());
	}

	private static void testAcctCreation() {
		String name = "Joe";
		String email = "joe97@gmail.com";
		String password = "Iliketurtles";
		Budget[] budgets = new Budget[1];
		Account a = new Account(email, password, budgets);
		System.out.println(a.getEmail());
		System.out.println(a.getPassword());
		System.out.println(a.getBudgets());
		System.out.println();
		Account b = new Account(name, email, password, budgets);
		System.out.println(b.getName());
		System.out.println(b.getEmail());
		System.out.println(b.getPassword());
		System.out.println(b.getBudgets());	
		System.out.println();
	}

}
