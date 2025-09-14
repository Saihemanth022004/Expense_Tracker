public class Expense {
    private String type;   // "Income" or "Expense"
    private String category;
    private double amount;
    private String date;   // yyyy-MM-dd
    private String note;

    public Expense(String type, String category, double amount, String date, String note) {
        this.type = type;
        this.category = category;
        this.amount = amount;
        this.date = date;
        this.note = note;
    }

    public String toCSV() {
        return type + "," + category + "," + amount + "," + date + "," + note;
    }

    public static Expense fromCSV(String line) {
        String[] parts = line.split(",");
        return new Expense(parts[0], parts[1], Double.parseDouble(parts[2]), parts[3], parts[4]);
    }

    // getters
    public String getType() { return type; }
    public String getCategory() { return category; }
    public double getAmount() { return amount; }
    public String getDate() { return date; }
}
