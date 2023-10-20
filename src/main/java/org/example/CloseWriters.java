package org.example;

import java.io.IOException;

public class CloseWriters {
    // Closes writers, put in mainmenu so i can close all of them before the program ends and not have any issues
    public CloseWriters() throws IOException {
        new IncomeStorage.WriteIncomeToFile().CloseIncomeWriter();
        new ExpenseStorage.WriteExpenseToFile().CloseExpenseWriter();
        new UserStorage().CloseUserWriter();
    }
}
