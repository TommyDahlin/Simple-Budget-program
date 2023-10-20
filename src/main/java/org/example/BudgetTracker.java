package org.example;

import java.io.IOException;

public class BudgetTracker {
    // Startup program reading in expenses and incomes then initializing the menu.
    public static void main(String[] args) throws IOException {
        new ExpenseStorage().expenseReader();
        new IncomeStorage().ReadIncome();
            new ScanFile().ScanFileIn();
            new MainMenu();
            }
        }