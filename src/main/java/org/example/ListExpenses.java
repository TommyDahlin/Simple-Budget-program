package org.example;

public class ListExpenses {
    public ListExpenses() {
        for (int i = 0; i < ExpenseStorage.expenseList.size(); i++) {
            System.out.println((ExpenseStorage.expenseList.get(i).expenseName));
            System.out.println((ExpenseStorage.expenseList.get(i).expenseDouble));
            System.out.println((ExpenseStorage.expenseList.get(i).ECategory.getCategory()));
            System.out.println("Date added: " + ExpenseStorage.expenseList.get(i).date);
            System.out.println("Id: " + (i+1));
        }
    }
}
