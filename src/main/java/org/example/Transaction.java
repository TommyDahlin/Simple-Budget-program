package org.example;
import java.util.Date;

public class Transaction {
    public static final String filepath = "src/main/user.json";
    public double amount;
    Date date = new Date();

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
