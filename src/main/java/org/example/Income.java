package org.example;

import java.util.function.Consumer;

// Income class extends transaction with Amount and Date.
// Made 3 enums for the class, for income categories.
public class Income extends Transaction{

    public ICategory getCategory() {
        return category;
    }

    public void setCategory(ICategory category) {
        this.category = category;
    }

    public String id = String.valueOf(IncomeStorage.incomeList.size()+1);
    public String incomeName;
    public ICategory category;
    public Income(String incomeName, ICategory category, String id) {
        this.incomeName = incomeName;
        this.category = category;
        this.id = id;
    }
    @Override
    public void setAmount(double amount){
        super.setAmount(amount);
    }
    public Income() {
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
// enums with oridnals and Category names for ease of use.
// Not sure why i added the implements, it was an auto-fix that intellij suggested and it made the program work.
enum ICategory implements Consumer<Income> {
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

    @Override
    public void accept(Income income) {

    }

    @Override
    public Consumer<Income> andThen(Consumer<? super Income> after) {
        return Consumer.super.andThen(after);
    }
}
