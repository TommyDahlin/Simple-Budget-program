package org.example;

import java.io.IOException;

public class BudgetCalc {
    BudgetCalc() throws IOException {
        double incomeAdd =0;
        for (int i = 0; i < IncomeStorage.incomeList.size(); i++) {
            double incomeHold = IncomeStorage.incomeList.get(i).getIncomeDouble();
            incomeAdd = incomeHold + incomeAdd;
        }
        System.out.println("Total income is: " + incomeAdd);
        double expenseAdd = 0;
        for (int i = 0; i < ExpenseStorage.expenseList.size(); i++) {
            double expenseHold = ExpenseStorage.expenseList.get(i).getExpenseDouble();
            expenseAdd = expenseHold + expenseAdd;
        }
        System.out.println("Total expenses are: " + expenseAdd);
        System.out.println("Your budget is: " + (incomeAdd-expenseAdd));
        new MainMenu();
    }
}
