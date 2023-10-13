package org.example;

import java.io.IOException;

public class RemoveExpense {
    RemoveExpense() throws IOException {
        new ListExpenses();
        System.out.println("Choose which one to remove by id: ");
        int listId = Integer.parseInt(InputReader.BufferedReaderOut());
        ExpenseStorage.expenseList.remove((listId - 1));
        new ExpensesMenu();
    }
}
