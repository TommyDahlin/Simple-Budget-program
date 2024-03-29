package org.example;
import java.util.Date;

// Transaction holds the amount and date variables that are inherited to both Income Class and Expense Class.
public class Transaction {
    public double amount;
    Date date = new Date();
// Only setter and getter are needed for amount because the date gets set automatically.
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
