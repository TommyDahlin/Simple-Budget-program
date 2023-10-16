package org.example;

public class ListIncome {
    public ListIncome(){
        for (int i = 0; i < IncomeStorage.incomeList.size(); i++) {
            System.out.println(IncomeStorage.incomeList.get(i).incomeName);
            System.out.println(IncomeStorage.incomeList.get(i).incomeDouble);
            System.out.println(IncomeStorage.incomeList.get(i).eIncomeCategory.getCategory());
            System.out.println("Date added: " + IncomeStorage.incomeList.get(i).date);
            System.out.println("ID: " + (i+1));
        }
    }
}
