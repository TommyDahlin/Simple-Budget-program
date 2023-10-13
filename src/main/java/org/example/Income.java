package org.example;

public class Income extends Transaction{
    public double incomeDouble;
    public String incomeName;
    public EIncomeCategory eIncomeCategory;
    public Income(double incomeDouble, String incomeName, EIncomeCategory eIncomeCategory) {
        this.incomeDouble = incomeDouble;
        this.incomeName = incomeName;
        this.eIncomeCategory = eIncomeCategory;
    }

    public Income() {

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
