package org.example;

import com.sun.tools.javac.Main;

import java.io.IOException;

public class ExpensesMenu {
    public ExpensesMenu() throws IOException {
        System.out.println("[1] Add Expenses.\n[2] Remove expenses.\n[3] List expenses. \n[4] Go back to main menu");
        String choice = InputReader.BufferedReaderOut();
        switch (choice){
            case "1" : {
                new CreateExpense();
                new ExpensesMenu();
            }
                case "2" :
                System.out.println("working on removing");
            case "3" :
                if (ExpenseStorage.expenseList == null){
                    System.out.println("There are no expenses added.\n");
                    new ExpensesMenu();
                }else {
                    new ListExpenses();
                    new ExpensesMenu();
                }
            case "4" : new MainMenu();
        }


    }
}
