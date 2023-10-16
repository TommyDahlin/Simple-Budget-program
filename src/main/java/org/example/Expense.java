package org.example;

import java.util.Date;

public class Expense extends Transaction{
    public double expenseDouble;
    public String expenseName;
    public EExpenseCategory eExpenseCategory;
    public Date date = new Date();

    public Expense(double expenseDouble, String expenseName, EExpenseCategory eExpenseCategory, Date date) {
        this.expenseDouble = expenseDouble;
        this.expenseName = expenseName;
        this.eExpenseCategory = eExpenseCategory;
        this.date = date;
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
