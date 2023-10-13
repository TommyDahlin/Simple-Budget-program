package org.example;

public class Expense extends Transaction{
    public double expenseDouble;
    public String expenseName;
    public EExpenseCategory eExpenseCategory;

    public Expense(double expenseDouble, String expenseName, EExpenseCategory eExpenseCategory) {
        this.expenseDouble = expenseDouble;
        this.expenseName = expenseName;
        this.eExpenseCategory = eExpenseCategory;
    }

    public Expense() {

    }

    public double getExpenseDouble() {
        return expenseDouble;
    }

    public void setExpenseDouble(double expenseDouble) {
        this.expenseDouble = expenseDouble;
    }

    public String getExpenseName() {
        return expenseName;
    }

    public void setExpenseName(String expenseName) {
        this.expenseName = expenseName;
    }

    public EExpenseCategory geteExpenseCategory() {
        return eExpenseCategory;
    }

    public void seteExpenseCategory(EExpenseCategory eExpenseCategory) {
        this.eExpenseCategory = eExpenseCategory;
    }
}
