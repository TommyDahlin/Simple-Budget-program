package org.example;

import java.util.Date;

public class Expense extends Transaction{
    public double expenseDouble;
    public String expenseName;
    public ECategory ECategory;
    public Date date = new Date();

    public Expense(double expenseDouble, String expenseName, ECategory ECategory, Date date) {
        this.expenseDouble = expenseDouble;
        this.expenseName = expenseName;
        this.ECategory = ECategory;
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

    public ECategory geteExpenseCategory() {
        return ECategory;
    }

    public void seteExpenseCategory(ECategory ECategory) {
        this.ECategory = ECategory;
    }
}
enum ECategory {
    FOOD("Food", 1),
    GAS("Gas", 2),
    RENT("Rent", 3),
    FUN("Fun", 4),
    OTHER("Other", 5),
    ;

    ECategory(String c, int o) {
        this.category = c;
        this.ordinal = o;
    }
    private String category;
    private int ordinal;
    ECategory(int o){
        this.ordinal = o;
    }
    public int getOrdinal(){
        return this.ordinal;
    }
    ECategory(String c){
        this.category= c;
    }
    public String getCategory(){
        return this.category;
    }
}

