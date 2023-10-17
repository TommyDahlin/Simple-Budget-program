package org.example;

import java.io.IOException;

public class RemoveIncome {
    RemoveIncome() throws IOException {
        System.out.println("Which Income do you want to change? Choose by ID");
        new ListIncome();
        int choice = Integer.parseInt(InputReader.BufferedReaderOut());
        IncomeStorage.incomeList.remove((choice-1));
        new Writers.WriteIncomeToFile();
        new IncomeMenu();
        }
    }
