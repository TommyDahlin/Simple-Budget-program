package org.example;

public class ListExpenses {
    public ListExpenses() {
        for (int i = 0; i < ExpenseStorage.expenseList.size(); i++) {
            System.out.println((ExpenseStorage.expenseList.get(i).expenseName));
            System.out.println((ExpenseStorage.expenseList.get(i).expenseDouble));
            System.out.println((ExpenseStorage.expenseList.get(i).eExpenseCategory.getCategory()));
            System.out.println("ID: " + (i +1) + "\n");
        }
    }
}
