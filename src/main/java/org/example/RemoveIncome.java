package org.example;

import java.io.BufferedReader;
import java.io.IOException;

public class RemoveIncome{
    RemoveIncome() throws IOException {
        new ListIncome();
        System.out.println("Choose which one to remove by id: ");
        int listId = Integer.parseInt(InputReader.BufferedReaderOut());
        IncomeStorage.incomeList.remove((listId - 1));
        new IncomeMenu();
    }
}
