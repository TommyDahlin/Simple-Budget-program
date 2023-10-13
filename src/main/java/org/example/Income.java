package org.example;

import java.util.Date;

public class Income extends Transaction{
    public double incomeDouble;
    public String incomeName;
    public EIncomeCategory eIncomeCategory;
    public Date date = new Date();
    public Income(double incomeDouble, String incomeName, EIncomeCategory eIncomeCategory, Date date) {
        this.incomeDouble = incomeDouble;
        this.incomeName = incomeName;
        this.eIncomeCategory = eIncomeCategory;
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

    public EIncomeCategory geteIncomeCategory() {
        return eIncomeCategory;
    }

    public void seteIncomeCategory(EIncomeCategory eIncomeCategory) {
        this.eIncomeCategory = eIncomeCategory;
    }
}
