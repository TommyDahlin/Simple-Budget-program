package org.example;

import com.google.gson.Gson;

import java.io.*;
import java.util.ArrayList;

public class IncomeMenu{
    public IncomeMenu() throws IOException {
        System.out.println("[1] Add Source of income.\n[2] Remove Source of income.\n[3] Change amount of money from income.\n[4] Go back to main menu.");
        String choice = InputReader.BufferedReaderOut();
        switch (choice){
            case "1" -> {
                new CreateIncome();
            }
            case "2" -> System.out.println("Remove income object");
            case "3" -> System.out.println("Edit income object");
            case "4" -> new MainMenu();
        }
    }
}
