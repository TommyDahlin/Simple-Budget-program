package org.example;

import java.io.IOException;

public class CloseWriters {
    public CloseWriters() throws IOException {
        new Writers.WriteIncomeToFile().CloseIncomeWriter();
        new Writers.WriteExpenseToFile().CloseExpenseWriter();
        new Writers.WriteUserToFile().CloseUserWriter();
    }
}
