package org.example;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

public class WriteExpenseToFile {
    private Gson gson = new Gson();
    private FileWriter efw = new FileWriter(FileLocation.expenseLocation);
    public WriteExpenseToFile() throws IOException {
        gson.toJson(ExpenseStorage.expenseList, efw);
        efw.flush();
    }
    public void CloseExpenseWriter() throws IOException {
        efw.close();
    }
}
