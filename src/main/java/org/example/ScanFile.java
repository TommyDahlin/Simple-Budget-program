package org.example;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.lang.reflect.Type;

public class ScanFile {
   public void ScanFileIn() throws FileNotFoundException {
        Gson gson = new Gson();
        FileReader fr = new FileReader(FileLocation.incomeLocation);
        IncomeStorage.incomeList = gson.fromJson((Reader) fr, (Type) IncomeStorage.incomeList);
       System.out.println(IncomeStorage.incomeList.get(0));
    }

}
