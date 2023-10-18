package org.example;

import java.io.IOException;

public class BudgetTracker {
    public static void main(String[] args) throws IOException {
        new ExpenseStorage().expenseReader();
        new IncomeStorage().ReadIncome();

            new ScanFile().ScanFileIn();
            new MainMenu();
            }
        }