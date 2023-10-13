package org.example;

public class BudgetMenu {
    public BudgetMenu(){
        System.out.println("Budget is: " + calcBudget());
    }
public double calcBudget(){
        double budgetOut=0;
        double incomeAdd = 0;
    for (int i = 0; i < IncomeStorage.incomeList.size(); i++) {
        double incomeHold = IncomeStorage.incomeList.get(i).incomeDouble;
        incomeAdd = incomeHold + incomeAdd;
    }
    double expenseAdd = 0;
    for (int i = 0; i < ExpenseStorage.expenseList.size(); i++) {
        double expenseHold = ExpenseStorage.expenseList.get(i).expenseDouble;
        expenseAdd = expenseHold+expenseAdd;
    }
    budgetOut = incomeAdd - expenseAdd;
    return budgetOut;
}
}
