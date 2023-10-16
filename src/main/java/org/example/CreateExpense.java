package org.example;

import java.io.IOException;
import java.util.List;

public class CreateExpense {
    public CreateExpense() throws IOException {
        System.out.println("How many expenses do you want to add?");
        int eAmt = Integer.parseInt(InputReader.BufferedReaderOut());
        for (int i = 0; i < eAmt; i++) {


            System.out.println("Create an expense.");
            Expense expense = new Expense();
            System.out.println("Name your expense.");
            expense.setExpenseName(InputReader.BufferedReaderOut());
            System.out.println("Amount.");
            expense.setExpenseDouble(Double.parseDouble(InputReader.BufferedReaderOut()));
            System.out.println("Choose a category through a number: \n[1] Food\n[2] Gas\n[3] Rent\n[4] Fun\n[5] Other");
            expense.seteExpenseCategory(getExpenseCat());
            List<Expense> expenseList = new ExpenseStorage().expenseList;
            expenseList.add(expense);
        }
        new WriteExpenseToFile();
        new ExpensesMenu();
    }
    public ECategory getExpenseCat() throws IOException {
        String check = InputReader.BufferedReaderOut();
        switch (check) {
            case "1": return ECategory.FOOD;
            case "2": return ECategory.GAS;
            case "3": return ECategory.RENT;
            case "4": return ECategory.FUN;
            case "5": return ECategory.OTHER;
            default : return null;
        }

    }
}
