package org.example;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

public class WriteIncomeToFile {
    private Gson gson = new Gson();
    private FileWriter ifw = new FileWriter(FileLocation.incomeLocation);
    public WriteIncomeToFile() throws IOException {
        gson.toJson(IncomeStorage.incomeList, ifw);
        ifw.flush();
    }
    public void CloseIncomeWriter() throws IOException {
        ifw.close();
    }
}
