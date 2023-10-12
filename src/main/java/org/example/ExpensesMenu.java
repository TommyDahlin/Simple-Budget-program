package org.example;

import com.sun.tools.javac.Main;

import java.io.IOException;

public class ExpensesMenu {
    public ExpensesMenu() throws IOException {
        System.out.println("[1] Add Expenses.\n[2] Remove expenses.\n[3] List expenses. \n[4] Go back to main menu");
        String choice = InputReader.BufferedReaderOut();
        switch (choice){
            case "1" : new CreateExpense();
            case "2" :
                System.out.println("working on removing");
            case "3" :
                System.out.println("Also working on it");
            case "4" : new MainMenu();

        }
    }
}
