package org.example;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    private Gson gson = new Gson();
    private FileWriter fw = new FileWriter(FileLocation.incomeLocation);
    public WriteToFile() throws IOException {
        gson.toJson(IncomeStorage.incomeList, fw);
        fw.flush();
    }
}
