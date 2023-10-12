package org.example;

public enum EExpenseCategory {
    FOOD("Food", 1),
    GAS("Gas", 2),
    RENT("Rent", 3),
    FUN("Fun", 4),
    OTHER("Other", 5),
    ;

    EExpenseCategory(String c, int o) {
        this.category = c;
        this.ordinal = o;
    }
    private String category;
    private int ordinal;
    EExpenseCategory(int o){
        this.ordinal = o;
    }
    public int getOrdinal(){
        return this.ordinal;
    }
    EExpenseCategory(String c){
        this.category= c;
    }
    public String getCategory(){
        return this.category;
    }
}
