package org.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CreateIncome {
    public CreateIncome() throws IOException {
        System.out.println("create income object");
        Income income = new Income();
        System.out.println("Name");
        income.setIncomeName(InputReader.BufferedReaderOut());
        System.out.println("Amount");
        income.setIncomeDouble(Double.parseDouble(InputReader.BufferedReaderOut()));
        System.out.println("Choose a category through a number: [1] Wage, [2] Services, [3] Other");
        income.seteIncomeCategory(getIncomeCat());
        List<Income> incomeList = new IncomeStorage().incomeList;
        incomeList.add(income);
        System.out.println(incomeList.get(0).incomeName + " " + incomeList.get(0).incomeDouble + incomeList.get(0).geteIncomeCategory().getCategory());
        new WriteIncomeToFile();
        new IncomeMenu();
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
