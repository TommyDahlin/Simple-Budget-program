package org.example;

import java.io.IOException;
import java.util.ArrayList;

public class CreateExpense {
    public CreateExpense() throws IOException {
        System.out.println("Create an expense.");
        Expense expense = new Expense();
        System.out.println("Name your expense.");
        expense.setExpenseName(InputReader.BufferedReaderOut());
        System.out.println("Amount.");
        expense.setExpenseDouble(Double.parseDouble(InputReader.BufferedReaderOut()));
        System.out.println("Choose a category through a number: \n[1] Food\n[2] Gas\n[3] Rent\n[4] Fun\n[5] Other");
        expense.seteExpenseCategory(getExpenseCat());
        ArrayList<Expense> expenseList = new ExpenseStorage().expenseList;
        expenseList.add(expense);
        new WriteExpenseToFile();
        new ExpensesMenu();
    }
    public EExpenseCategory getExpenseCat() throws IOException {
        String check = InputReader.BufferedReaderOut();
        switch (check) {
            case "1": return EExpenseCategory.FOOD;
            case "2": return EExpenseCategory.GAS;
            case "3": return EExpenseCategory.RENT;
            case "4": return EExpenseCategory.FUN;
            case "5": return EExpenseCategory.OTHER;
            default : return null;
        }

    }
}
