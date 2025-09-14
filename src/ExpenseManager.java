import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExpenseManager {
    private List<Expense> expenses;

    public ExpenseManager() {
        try {
            this.expenses = FileHandler.loadExpenses();
        } catch (IOException e) {
            this.expenses = new ArrayList<>();
            System.out.println("⚠️ Could not load expenses, starting fresh.");
        }
    }

    // Add new expense/income
    public void addExpense(Expense expense) {
        expenses.add(expense);
        try {
            FileHandler.saveExpense(expense);
        } catch (IOException e) {
            System.out.println("❌ Failed to save expense: " + e.getMessage());
        }
    }

    // View all transactions
    public void viewAllExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No transactions found.");
            return;
        }
        for (Expense e : expenses) {
            System.out.println(e.toCSV());
        }
    }

    // Get list for reports
    public List<Expense> getExpenses() {
        return expenses;
    }
}
