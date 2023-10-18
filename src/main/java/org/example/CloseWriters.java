package org.example;

import java.io.IOException;

public class CloseWriters {
    public CloseWriters() throws IOException {
        new IncomeStorage.WriteIncomeToFile().CloseIncomeWriter();
        new ExpenseStorage.WriteExpenseToFile().CloseExpenseWriter();
        new Writers.WriteUserToFile().CloseUserWriter();
    }
}
