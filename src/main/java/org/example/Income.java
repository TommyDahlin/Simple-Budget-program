package org.example;
// Income class extends transaction with Amount and Date.
// Made 3 enums for the class, for income categories.
public class Income extends Transaction{
    public String incomeName;
    public ICategory category;
    public Income(String incomeName, ICategory category) {
        this.incomeName = incomeName;
        this.category = category;
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
