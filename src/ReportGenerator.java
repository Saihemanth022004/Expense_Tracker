import java.util.*;

public class ReportGenerator {
    public static void generateReport(List<Expense> expenses) {
        double totalIncome = 0, totalExpense = 0;
        Map<String, Double> categoryMap = new HashMap<>();

        for (Expense e : expenses) {
            if (e.getType().equalsIgnoreCase("Income")) {
                totalIncome += e.getAmount();
            } else {
                totalExpense += e.getAmount();
                categoryMap.put(e.getCategory(), categoryMap.getOrDefault(e.getCategory(), 0.0) + e.getAmount());
            }
        }

        System.out.println("\n📊 Expense Report 📊");
        System.out.println("Total Income : " + totalIncome);
        System.out.println("Total Expense: " + totalExpense);
        System.out.println("Balance      : " + (totalIncome - totalExpense));

        System.out.println("\nCategory-wise Expenses:");
        for (String category : categoryMap.keySet()) {
            System.out.println(category + " → " + categoryMap.get(category));
        }
    }
}
