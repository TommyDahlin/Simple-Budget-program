package org.example;

import com.sun.tools.javac.Main;

import java.io.IOException;

public class ExpensesMenu {
    public ExpensesMenu() throws IOException {
        System.out.println("[1] Add Expenses.\n[2] Remove expenses.\n[3] List expenses. \n[4] Go back to main menu");
        String choice = InputReader.BufferedReaderOut();
        switch (choice){
            case "1" : {
                System.out.println("How many expenses do you want to add?");
                int eAmt = Integer.parseInt(InputReader.BufferedReaderOut());
                for (int i = 0; i < eAmt; i++) {
                    new CreateExpense();
                }
                new ExpensesMenu();
            }
                case "2" :
                System.out.println("working on removing");
            case "3" :
                if (ExpenseStorage.expenseList == null){
                    System.out.println("There are no expenses added.\n");
                    new ExpensesMenu();
                }else {
                for (int i = 0; i < ExpenseStorage.expenseList.size(); i++) {
                    System.out.println((ExpenseStorage.expenseList.get(i).expenseName));
                    System.out.println((ExpenseStorage.expenseList.get(i).expenseDouble));
                    System.out.println((ExpenseStorage.expenseList.get(i).eExpenseCategory.getCategory()));
                    new ExpensesMenu();
                }}
            case "4" : new MainMenu();

        }
    }
}
