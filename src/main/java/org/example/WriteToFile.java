package org.example;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile extends FileLocation {
    Gson gson = new Gson();
    // set filepath and filename
    FileWriter fw = new FileWriter(fileLocation);

    public WriteToFile() throws IOException {
        gson.toJson(fw);
        fw.close();
    }
}
