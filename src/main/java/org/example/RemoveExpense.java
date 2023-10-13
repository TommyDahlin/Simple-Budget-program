package org.example;

import java.io.IOException;

public class RemoveExpense {
    RemoveExpense() throws IOException {
        System.out.println("Which Income do you want to change? Choose by ID");
        new ListExpenses();
        int choice = Integer.parseInt(InputReader.BufferedReaderOut());
        ExpenseStorage.expenseList.remove((choice-1));
        new WriteExpenseToFile();
        new IncomeMenu();
    }
}
