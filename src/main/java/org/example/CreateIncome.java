package org.example;

import java.io.IOException;
import java.util.List;

public class CreateIncome {
    public CreateIncome() throws IOException {
        System.out.println("How many incomes do you want to add?");
        int iAmt = Integer.parseInt(InputReader.BufferedReaderOut());
        for (int i = 0; i < iAmt; i++) {


        Income income = new Income();
        System.out.println("Name");
        income.setIncomeName(InputReader.BufferedReaderOut());
        System.out.println("Amount");
        income.setIncomeDouble(Double.parseDouble(InputReader.BufferedReaderOut()));
        System.out.println("Choose a category through a number: [1] Wage, [2] Services, [3] Other");
        income.setIncomeCategory(getIncomeCat());
        List<Income> incomeList = new IncomeStorage().incomeList;
        incomeList.add(income);
        System.out.println(incomeList.get(0).incomeName + " " + incomeList.get(0).incomeDouble + incomeList.get(0).getIncomeCategory().getCategory());
    }
        new WriteIncomeToFile();
    }
    public ICategory getIncomeCat() throws IOException {
        String check = InputReader.BufferedReaderOut();
        if (check.equals("1")){
            return ICategory.WAGE;
        } else if (check.equals("2")){
            return ICategory.SERVICES;
        } else if (check.equals("3")){
            return ICategory.OTHER;
        }else System.out.println("Please input a valid category number");
        return null;
    }
}
