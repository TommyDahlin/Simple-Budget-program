package org.example;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IncomeStorage {
    FileLocation fileLocation = new FileLocation();
    String filename = fileLocation.fileLocation;
    Gson gson = new Gson();
    FileWriter fileWriter = new FileWriter(String.valueOf(fileLocation));

    public IncomeStorage() throws IOException {
       // gson.toJson();
       // fileWriter.close();
    }
}
