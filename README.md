````markdown
# Expense Tracker 🧾

A simple Java console-application to track incomes and expenses, store data persistently, and generate reports.  

---

## Table of Contents

- [Features](#features)  
- [Project Structure](#project-structure)  
- [Usage](#usage)  
- [How to Run](#how-to-run)  
- [Data Format](#data-format)  
- [Future Enhancements](#future-enhancements)  
- [Author](#author)  
- [License](#license)  

---

## Features

- Add **Income** or **Expense** entries with fields: category, amount, date, note.  
- View all transactions.  
- Persistent storage in a CSV file (`expenses.csv`).  
- Generate reports with totals and category-wise breakdown.  

---

## Project Structure

```text
Expense_Tracker/
├── src/
│   ├── Main.java
│   ├── Expense.java
│   ├── FileHandler.java
│   ├── ExpenseManager.java
│   └── ReportGenerator.java
├── expenses.csv
├── .gitignore
└── idea files / project metadata
````

* `src/` — source files containing the code.
* `expenses.csv` — storage file where all entries are saved.
* `.gitignore` — files/folders to exclude from version control.

---

## Usage

1. Start the program.

2. Choose from menu options:

   ```
   1. Add Income  
   2. Add Expense  
   3. View All Transactions  
   4. Generate Report  
   5. Exit  
   ```

3. For adding entries, you’ll provide:

   * **Category** (e.g. Food, Salary)
   * **Amount** (e.g. 250.75)
   * **Date** (format: YYYY-MM-DD)
   * **Note** (optional description)

4. Reports show total income, total expenses, balance, and category-wise summary.

---

## How to Run

Make sure you have Java (JDK 8 or higher) installed.

```bash
# Clone the repository
git clone https://github.com/Saihemanth022004/Expense_Tracker.git

# Navigate into project directory
cd Expense_Tracker/src

# Compile all .java files
javac *.java

# Run the main program
java Main
```

---

## Data Format

* Transactions are stored in `expenses.csv`.

* Example:

  ```
  Expense,Food,250.00,2025-09-10,Lunch at cafe
  Income,Salary,50000.00,2025-09-01,September salary
  Expense,Transport,60.50,2025-09-11,Bus fare
  ```

* Fields:
  `type, category, amount, date, note`

---

## Future Enhancements

* Input validation (e.g. date format, amount > 0).
* Use `LocalDate` instead of strings for dates.
* Export reports to PDF or Excel.
* GUI using Swing or JavaFX.
* Database integration (SQLite/MySQL).
* Unit tests with JUnit.

---

## Author

* **Sai Hemanth**
  [@Saihemanth022004](https://github.com/Saihemanth022004)

---

