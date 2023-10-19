package org.example;

import com.sun.tools.javac.Main;

import java.io.IOException;

public class ExpensesMenu {
    public ExpensesMenu() throws IOException {
        System.out.println("[1] Add Expenses.\n[2] Remove expenses.\n[3] List expenses. \n[4] Change an expense. \n[5] Search for expense. \n[6] Go back to main menu");
        String choice = InputReader.BufferedReaderOut();
        switch (choice){
            case "1" : {
                new ExpenseStorage().CreateExpense();
                new ExpensesMenu();
            }
                case "2" : new ExpenseStorage().RemoveExpense();
            case "3" :
                if (ExpenseStorage.expenseList == null){
                    System.out.println("There are no expenses added.\n");
                    new ExpensesMenu();
                }else {
                    System.out.println("[1]List full details by time added. \n[2] List category Rent\n[3] List category Gas\n[4] List category Food \n[5] List category Fun \n[6] List category Other");
                    choice = InputReader.BufferedReaderOut();
                    switch (choice) {
                        case "1" -> {
                            new ExpenseStorage().ListExpenses();
                            new ExpensesMenu();
                        }
                        case "2" -> ExpenseStorage.ListByCatRent();
                        case "3" -> ExpenseStorage.ListByCatGas();
                        case "4" -> ExpenseStorage.ListByCatFood();
                        case "5" -> ExpenseStorage.ListByCatFun();
                        case "6" -> ExpenseStorage.ListByCatOther();
                    }

                }
            case "4" : new ExpenseStorage().ChangeExpense();
            case "5" : new ExpenseStorage().SearchExpense();
            case "6" : new MainMenu();
            default:
                System.out.println("Type a valid number.");
                new ExpensesMenu();
        }



    }
}
