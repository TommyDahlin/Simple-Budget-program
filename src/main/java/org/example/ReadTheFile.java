package org.example;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadTheFile extends FileLocation {
    FileReader fr = new FileReader(fileLocation);
    public ReadTheFile() throws FileNotFoundException {
    }
}
