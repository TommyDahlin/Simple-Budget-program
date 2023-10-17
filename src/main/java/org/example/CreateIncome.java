package org.example;

import java.io.IOException;
import java.util.List;
// CreateIncome class is basically the same as CreateExpense comments here
// are also valid for CreateExpense.
public class CreateIncome {
    public CreateIncome() throws IOException {
        System.out.println("How many incomes do you want to add?");
        //Simple for loop to choose how many objects you want to create.
        int iAmt = Integer.parseInt(InputReader.BufferedReaderOut());
        for (int i = 0; i < iAmt; i++) {

        // Inits a new Income Object, and through default constructor fills in all the needed fields, date and amount gets inherited from Transaction Class
        Income income = new Income();
        System.out.println("Name");
        income.setIncomeName(InputReader.BufferedReaderOut());
        System.out.println("Amount");
        income.setAmount((Double.parseDouble(InputReader.BufferedReaderOut())));
        //Only way I found to make the incomecategory get stuck to the obj.
        System.out.println("Choose a category through a number: [1] Wage, [2] Services, [3] Other");
        income.setIncomeCategory(getIncomeCat());
        List<Income> incomeList = new IncomeStorage().incomeList;
        incomeList.add(income);
        System.out.println("Name" + incomeList.get(0).incomeName + " Amount: " + incomeList.get(0).amount + " Category: " + incomeList.get(0).getIncomeCategory().getCategory());
    }
        new Writers.WriteIncomeToFile();
    }
    // Method for getting the category from user input to the Income Object.
    public ICategory getIncomeCat() throws IOException {
        String check = InputReader.BufferedReaderOut();
        if (check.equals("1")){
            return ICategory.WAGE;
        } else if (check.equals("2")){
            return ICategory.SERVICES;
        } else if (check.equals("3")){
            return ICategory.OTHER;
        }else System.out.println("Please input a valid category number");
        return getIncomeCat();
    }
}
