package org.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CreateIncome {
    public CreateIncome() throws IOException {
        System.out.println("How many incomes do you want to add?");
        int iAmt = Integer.parseInt(InputReader.BufferedReaderOut());
        for (int i = 0; i < iAmt; i++) {


        System.out.println("create income object");
        Income income = new Income();
        System.out.println("Name");
        income.setIncomeName(InputReader.BufferedReaderOut());
        System.out.println("Amount");
        income.setIncomeDouble(Double.parseDouble(InputReader.BufferedReaderOut()));
        System.out.println("Choose a category through a number: [1] Wage, [2] Services, [3] Other");
        income.seteIncomeCategory(getIncomeCat());
        income.setDate();
        List<Income> incomeList = new IncomeStorage().incomeList;
        incomeList.add(income);
        System.out.println(incomeList.get(0).incomeName + " " + incomeList.get(0).incomeDouble + incomeList.get(0).geteIncomeCategory().getCategory());
    }
        new WriteIncomeToFile();
    }
    public EIncomeCategory getIncomeCat() throws IOException {
        String check = InputReader.BufferedReaderOut();
        if (check.equals("1")){
            return EIncomeCategory.WAGE;
        } else if (check.equals("2")){
            return EIncomeCategory.SERVICES;
        } else if (check.equals("3")){
            return EIncomeCategory.OTHER;
        }else System.out.println("Please input a valid category number");
        return null;
    }
}
