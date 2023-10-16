package org.example;

import java.util.Date;

public class Income extends Transaction{
    public double incomeDouble;
    public String incomeName;
    public ICategory category;
    public Date date = new Date();
    public Income(double incomeDouble, String incomeName, ICategory category, Date date) {
        this.incomeDouble = incomeDouble;
        this.incomeName = incomeName;
        this.category = category;
        this.date = date;
    }

    public Income() {

    }
    public void setIncomeDate(){
        this.date = date;
    }

    public double getIncomeDouble() {
        return incomeDouble;
    }

    public void setIncomeDouble(double incomeDouble) {
        this.incomeDouble = incomeDouble;
    }

    public String getIncomeName() {
        return incomeName;
    }

    public void setIncomeName(String incomeName) {
        this.incomeName = incomeName;
    }

    public ICategory getIncomeCategory() {
        return category;
    }

    public void setIncomeCategory(ICategory category) {
        this.category = category;
    }
}
enum ICategory {
    WAGE("Wage", 1),
    SERVICES("Services", 2),
    OTHER("Other", 3);
    ICategory(String c, int o) {
        this.category = c;
        this.ordinal = o;
    }
    private String category;
    private int ordinal;
    ICategory(int o){
        this.ordinal = o;
    }
    public int getOrdinal(){
        return this.ordinal;
    }
    ICategory(String c){
        this.category= c;
    }
    public String getCategory(){
        return this.category;
    }
}
