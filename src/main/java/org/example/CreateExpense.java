package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
// This is a mirrored Class of IncomeExpense, if you wonder anything check there.
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
            expense.setAmount(Double.parseDouble(InputReader.BufferedReaderOut()));
            System.out.println("Choose a category through a number: \n[1] Food\n[2] Gas\n[3] Rent\n[4] Fun\n[5] Other");
            expense.seteExpenseCategory(getExpenseCat());
            List<Expense> expenseList = new ExpenseStorage().expenseList;
            System.out.println("Name" + expenseList.get(0).expenseName + " Amount: " + expenseList.get(0).amount + " Category: " + expenseList.get(0).geteExpenseCategory().getCategory());
            expenseList.add(expense);
        }
        new Writers.WriteExpenseToFile();
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
            default :
                System.out.println("Please input a valid category.");
                return getExpenseCat();
        }
    }
}
