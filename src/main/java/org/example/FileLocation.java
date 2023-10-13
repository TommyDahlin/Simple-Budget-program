package org.example;

public class FileLocation {
    public static String incomeLocation = "uppgift2/src/main/income.json";
    public static String expenseLocation = "uppgift2/src/main/expenses.json";

    public static String getExpenseLocation() {
        return expenseLocation;
    }

    public String getIncomeLocation() {
        return incomeLocation;
    }
}
