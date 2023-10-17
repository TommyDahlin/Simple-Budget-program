package org.example;

import java.io.IOException;

public class BudgetCalc {
    // Simple method to read the budget and show it for the user.
    BudgetCalc() throws IOException {
        double incomeAdd =0;
        for (int i = 0; i < IncomeStorage.incomeList.size(); i++) {
            double incomeHold = IncomeStorage.incomeList.get(i).getAmount();
            incomeAdd = incomeHold + incomeAdd;
        }
        System.out.println("Total income is: " + incomeAdd);
        double expenseAdd = 0;
        for (int i = 0; i < ExpenseStorage.expenseList.size(); i++) {
            double expenseHold = ExpenseStorage.expenseList.get(i).getAmount();
            expenseAdd = expenseHold + expenseAdd;
        }
        System.out.println("Total expenses are: " + expenseAdd);
        System.out.println("Your budget is: " + (incomeAdd-expenseAdd));
        if (incomeAdd-expenseAdd <= 0){
            System.out.println("You're broke.");
        }
        new MainMenu();
    }
}
