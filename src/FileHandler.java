import java.io.*;
import java.util.*;

public class FileHandler {
    private static final String FILE_NAME = "expenses.csv";

    public static void saveExpense(Expense expense) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME, true));
        bw.write(expense.toCSV());
        bw.newLine();
        bw.close();
    }

    public static List<Expense> loadExpenses() throws IOException {
        List<Expense> expenses = new ArrayList<>();
        File file = new File(FILE_NAME);
        if (!file.exists()) return expenses;

        BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));
        String line;
        while ((line = br.readLine()) != null) {
            expenses.add(Expense.fromCSV(line));
        }
        br.close();
        return expenses;
    }
}
