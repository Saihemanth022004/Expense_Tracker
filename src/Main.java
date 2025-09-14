import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExpenseManager manager = new ExpenseManager();

        while (true) {
            System.out.println("\n===== Expense Tracker =====");
            System.out.println("1. Add Income");
            System.out.println("2. Add Expense");
            System.out.println("3. View All Transactions");
            System.out.println("4. Generate Report");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1 || choice == 2) {
                System.out.print("Enter category: ");
                String category = sc.nextLine();
                System.out.print("Enter amount: ");
                double amount = sc.nextDouble();
                sc.nextLine();
                System.out.print("Enter date (yyyy-MM-dd): ");
                String date = sc.nextLine();
                System.out.print("Enter note: ");
                String note = sc.nextLine();

                Expense exp = new Expense(choice == 1 ? "Income" : "Expense", category, amount, date, note);
                manager.addExpense(exp);
                System.out.println("Entry added!");
            }
            else if (choice == 3) {
                manager.viewAllExpenses();
            }
            else if (choice == 4) {
                ReportGenerator.generateReport(manager.getExpenses());
            }
            else {
                break;
            }
        }
    }
}
