package org.example;

import java.io.IOException;

public class ListIncome {
    public ListIncome(){
        for (int i = 0; i < IncomeStorage.incomeList.size(); i++) {
            System.out.println(IncomeStorage.incomeList.get(i).incomeName);
            System.out.println(IncomeStorage.incomeList.get(i).incomeDouble);
            System.out.println(IncomeStorage.incomeList.get(i).eIncomeCategory.getCategory());
        }
    }
}
