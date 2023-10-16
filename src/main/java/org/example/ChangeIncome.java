package org.example;

import java.io.IOException;

public class ChangeIncome {
    public ChangeIncome() throws IOException {
        System.out.println("Choose income to change by ID.");
        new ListIncome();
        int choice = Integer.parseInt(InputReader.BufferedReaderOut());
        System.out.println("What do you want to change? [1] Name [2] Amount [3] Category");
        String changeChoice = InputReader.BufferedReaderOut();
        switch (changeChoice){
            case "1": {
                System.out.println("Type the name:");
                IncomeStorage.incomeList.get(choice).setIncomeName(InputReader.BufferedReaderOut());
                new IncomeMenu();
                break;
            }
            case "2": {
                System.out.println("Input amount:");
                IncomeStorage.incomeList.get(choice).setIncomeDouble(Double.parseDouble(InputReader.BufferedReaderOut()));
                new IncomeMenu();
                break;
            }
            case "3": {
                System.out.println("Choose a category. [1] Wage. [2] Services [3] Other");
               changeChoice = InputReader.BufferedReaderOut();
                switch (changeChoice) {
                    case "1": {
                        IncomeStorage.incomeList.get(choice).seteIncomeCategory(EIncomeCategory.WAGE);
                        new IncomeMenu();
                    }
                    case "2": {
                        IncomeStorage.incomeList.get(choice).seteIncomeCategory(EIncomeCategory.SERVICES);
                        new IncomeMenu();
                    }
                    case "3":{
                        IncomeStorage.incomeList.get(choice).seteIncomeCategory(EIncomeCategory.OTHER);
                        new IncomeMenu();
                }
                    default :
                        System.out.println("Type a valid number.");
                        new ChangeIncome();
                }
            } default:
                System.out.println("Type a valid number.");
                new ChangeIncome();
        }

    }
}
