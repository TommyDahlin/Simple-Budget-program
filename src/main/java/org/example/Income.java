package org.example;

public class Income extends Transaction{
    public double incomeAmt;
public String incomeName;
public enum EIncomeCategory {WAGE, OTHER, SERVICES}
    public Income(double incomeAmt, String incomeName) {
        this.incomeAmt = incomeAmt;
        this.incomeName = incomeName;
    }
}
