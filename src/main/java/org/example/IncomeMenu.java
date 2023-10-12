package org.example;

import com.google.gson.Gson;

import java.io.*;
import java.util.ArrayList;

public class IncomeMenu {
    public IncomeMenu() throws IOException {
        System.out.println("[1] Add Source of income.\n[2] Remove Source of income.\n[3] List income.\n[4] Go back to main menu.");
        String choice = InputReader.BufferedReaderOut();
        switch (choice) {
            case "1" -> {
                new CreateIncome();
            }
            case "2" -> System.out.println("Remove income object");
            case "3" -> {
                System.out.println("List Expenses");

                for (int i = 0; i < IncomeStorage.incomeList.size(); i++) {
                    System.out.println(IncomeStorage.incomeList.get(i).incomeName);
                    System.out.println(IncomeStorage.incomeList.get(i).incomeDouble);
                    System.out.println(IncomeStorage.incomeList.get(i).eIncomeCategory.getCategory());
                }

            }
            case "4" -> new MainMenu();
        }
    }
}
