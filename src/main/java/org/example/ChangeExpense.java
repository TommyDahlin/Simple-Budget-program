package org.example;

import java.io.IOException;

public class ChangeExpense {
    public ChangeExpense() throws IOException {
        new ListExpenses();
        System.out.println("Choose expense to change by ID.");
        int choice = Integer.parseInt(InputReader.BufferedReaderOut());
        System.out.println("What do you want to change? [1] Name [2] Amount [3] Category");
        String changeChoice = InputReader.BufferedReaderOut();
        switch (changeChoice){
            case "1": {
                System.out.println("Type the new name: ");
                ExpenseStorage.expenseList.get(choice).setExpenseName(InputReader.BufferedReaderOut());
                new ExpensesMenu();
            }
            case "2": {
                System.out.println("Input amount: ");
                ExpenseStorage.expenseList.get(choice).setExpenseDouble(Double.parseDouble(InputReader.BufferedReaderOut()));
                new ExpensesMenu();
            }
            case "3":{
                System.out.println("Choose what category you want to change to.");
                System.out.println("[1] Food \n[2] Gas \n[3] Rent \n[4] Fun \n[5] Other");
                switch(choice) {
                    case 1: {
                        ExpenseStorage.expenseList.get(choice).seteExpenseCategory(EExpenseCategory.FOOD);
                        new ExpensesMenu();
                    }
                    case 2: {
                        ExpenseStorage.expenseList.get(choice).seteExpenseCategory(EExpenseCategory.GAS);
                        new ExpensesMenu();
                    }
                    case 3: {
                        ExpenseStorage.expenseList.get(choice).seteExpenseCategory(EExpenseCategory.RENT);
                        new ExpensesMenu();
                    }
                    case 4: {
                        ExpenseStorage.expenseList.get(choice).seteExpenseCategory(EExpenseCategory.FUN);
                        new ExpensesMenu();
                    }
                    case 5: {
                        ExpenseStorage.expenseList.get(choice).seteExpenseCategory(EExpenseCategory.OTHER);
                        new ExpensesMenu();
                    }
                    default:
                        System.out.println("Type a valid number.");
                        new ChangeExpense();
                }
            }
            default:
                System.out.println("Type a valid number.");
                new ChangeExpense();
        }
    }
}
