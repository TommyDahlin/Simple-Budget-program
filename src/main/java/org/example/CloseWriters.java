package org.example;

import java.io.IOException;

public class CloseWriters {
    public CloseWriters() throws IOException {
        new WriteIncomeToFile().CloseIncomeWriter();
        new WriteExpenseToFile().CloseExpenseWriter();
    }
}
