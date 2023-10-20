package org.example;

import java.io.IOException;

import static org.example.InputReader.StringOut;

public class MainMenu {
    // Simple Main Menu.
    public MainMenu() throws IOException {
        System.out.println("Welcome to the Budget-Program.\nMake your choice.\n[1] Budget.\n[2] Income.\n[3] Expenses.\n[4] User Options.\n[0] Exit program.");
        String choice = StringOut();

        switch (choice) {
            case "1" -> {
                System.out.println("Budget.");
                new BudgetMenu();
            }
            case "2" -> {
                System.out.println("Income.");
                new IncomeMenu();
            }
            case "3" -> {
                System.out.println("Expenses.");
                new ExpensesMenu();
            }
            case "4" -> {
                System.out.println("User");
                new UserMenu();
            }
            case "0" -> {
                System.out.println("The program will exit now");
                new CloseWriters();
                System.exit(0);
            }
            default -> {
                System.out.println("You have to input a menu choice.");
                new MainMenu();
            }
        }
    }
}
