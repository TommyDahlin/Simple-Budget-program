package org.example;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

public class IncomeStorage extends Income {
    public static FileLocation fileLocation = new FileLocation();
    public  Gson gson = new Gson();
    public static FileWriter fileWriter;

    static {
        try {
            fileWriter = new FileWriter(String.valueOf(fileLocation.incomeLocation));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public IncomeStorage() throws IOException {
    }

    public void IncomeToFile() throws IOException {
       gson.toJson(incomeList, fileWriter);
       fileWriter.flush();
    }
    public void IncomeStorageWage() throws IOException {
        System.out.println("What is the income amount?");
        setIncomeDouble(Double.parseDouble(InputReader.BufferedReaderOut()));
        System.out.println("what do you want to name the income?");
        setIncomeName(InputReader.BufferedReaderOut());
        this.eIncomeCategory = EIncomeCategory.WAGE;
        Income income = new Income(this.incomeDouble,this.incomeName, this.eIncomeCategory);
        incomeList.add(income);
        System.out.println(this.incomeDouble + " " + this.incomeName + " " + this.eIncomeCategory);
    }
}
