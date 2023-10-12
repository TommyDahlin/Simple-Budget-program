package org.example;

public enum EIncomeCategory {
    WAGE("Wage", 1),
    SERVICES("Services", 2),
    OTHER("Other", 3);
    EIncomeCategory(String c, int o) {
        this.category = c;
        this.ordinal = o;
    }
    private String category;
    private int ordinal;
    EIncomeCategory(int o){
        this.ordinal = o;
    }
    public int getOrdinal(){
        return this.ordinal;
    }
    EIncomeCategory(String c){
        this.category= c;
    }
    public String getCategory(){
        return this.category;
    }
}
