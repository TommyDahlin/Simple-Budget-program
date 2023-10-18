package org.example;

public class FileLocation {
    public static String userLocation = "src/main/user.json";
    public static String incomeLocation = "src/main/income.json";
    public static String expenseLocation = "src/main/expenses.json";

    public static String getExpenseLocation() {
        return expenseLocation;
    }

    public String getIncomeLocation() {
        return incomeLocation;
    }
}
