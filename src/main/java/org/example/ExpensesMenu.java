package org.example;

import com.sun.tools.javac.Main;

import java.io.IOException;

public class ExpensesMenu {
    public ExpensesMenu() throws IOException {
        System.out.println("[1] Add Expenses.\n[2] Remove expenses.\n[3] List expenses. \n[4] Change an expense. \n[5] Go back to main menu");
        String choice = InputReader.BufferedReaderOut();
        switch (choice){
            case "1" : {
                new CreateExpense();
                new ExpensesMenu();
            }
                case "2" : new RemoveExpense();
            case "3" :
                if (ExpenseStorage.expenseList == null){
                    System.out.println("There are no expenses added.\n");
                    new ExpensesMenu();
                }else {
                    new ListExpenses();
                    new ExpensesMenu();
                }
            case "4" : new ChangeExpense();
            case "5" : new MainMenu();
            default:
                System.out.println("Type a valid number.");
                new ExpensesMenu();
        }



    }
}
