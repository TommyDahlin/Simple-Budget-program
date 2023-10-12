package org.example;

import java.io.IOException;

import static org.example.InputReader.BufferedReaderOut;

public class MainMenu {
    public MainMenu() throws IOException {
        System.out.println("Welcome to the Budget-Program.\nMake your choice.\n[1] Budget.\n[2] Income.\n[3] Expenses.\n[4] User Options.\n[0] Exit program.");
        String choice = BufferedReaderOut();

        switch (choice) {
            case "1" -> {
                System.out.println("Budget.");
                new BudgetMenu();
                break;
            }
            case "2" -> {
                System.out.println("Income.");
                new IncomeMenu();
                break;
            }
            case "3" -> {
                System.out.println("Expenses.");
                new ExpensesMenu();
                break;
            }
            case "4" -> {
                System.out.println("User");
                new UserMenu();
                break;
            }
            case "0" -> {
                System.out.println("The program will exit now");
                new CloseWriters();
                break;
            }
        }
    }
}
