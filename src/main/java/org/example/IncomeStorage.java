package org.example;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class IncomeStorage {
    public static ArrayList<Income> incomeList = new ArrayList<>();

    public static class WriteIncomeToFile {
        private Gson gson = new Gson();
        private FileWriter ifw = new FileWriter(FileLocation.incomeLocation);

        public WriteIncomeToFile() throws IOException {
            gson.toJson(IncomeStorage.incomeList, ifw);
            ifw.flush();
        }

        public void CloseIncomeWriter() throws IOException {
            ifw.close();
        }
    }

    public void CreateIncome() throws IOException {
        System.out.println("How many incomes do you want to add?");
        //Simple for loop to choose how many objects you want to create.
        int iAmt = InputReader.BufferedReaderInt();
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
        new WriteIncomeToFile();
    }

    // Method for getting the category from user input to the Income Object.
    public ICategory getIncomeCat() throws IOException {
        String check = InputReader.BufferedReaderOut();
        if (check.equals("1")) {
            return ICategory.WAGE;
        } else if (check.equals("2")) {
            return ICategory.SERVICES;
        } else if (check.equals("3")) {
            return ICategory.OTHER;
        } else System.out.println("Please input a valid category number");
        return getIncomeCat();
    }

    public void ListIncome() {
        for (int i = 0; i < IncomeStorage.incomeList.size(); i++) {
            System.out.println(IncomeStorage.incomeList.get(i).incomeName);
            System.out.println("Income amount " + IncomeStorage.incomeList.get(i).amount);
            System.out.println(IncomeStorage.incomeList.get(i).category.getCategory());
            System.out.println("Date added: " + IncomeStorage.incomeList.get(i).date);
            System.out.println("ID: " + (i + 1));
        }
    }

    public void ChangeIncome() throws IOException {
        System.out.println("Choose income to change by ID.");
        new IncomeStorage().ListIncome();
        int choice = InputReader.BufferedReaderInt();
        choice = choice - 1;
        System.out.println("What do you want to change? [1] Name [2] Amount [3] Category");
        String changeChoice = InputReader.BufferedReaderOut();
        switch (changeChoice) {
            case "1": {
                System.out.println("Type the name:");
                IncomeStorage.incomeList.get(choice).setIncomeName(InputReader.BufferedReaderOut());
                new IncomeMenu();
                break;
            }
            case "2": {
                System.out.println("Input amount:");
                IncomeStorage.incomeList.get(choice).setAmount(InputReader.BufferedReaderDouble());
                new IncomeMenu();
                break;
            }
            case "3": {
                System.out.println("Choose a category. [1] Wage. [2] Services [3] Other");
                changeChoice = InputReader.BufferedReaderOut();
                switch (changeChoice) {
                    case "1": {
                        IncomeStorage.incomeList.get(choice).setIncomeCategory(ICategory.WAGE);
                        new IncomeMenu();
                    }
                    case "2": {
                        IncomeStorage.incomeList.get(choice).setIncomeCategory(ICategory.SERVICES);
                        new IncomeMenu();
                    }
                    case "3": {
                        IncomeStorage.incomeList.get(choice).setIncomeCategory(ICategory.OTHER);
                        new IncomeMenu();
                    }
                    default:
                        System.out.println("Type a valid number.");
                        new IncomeStorage().ChangeIncome();
                }
            }
            default:
                System.out.println("Type a valid number.");
                new IncomeStorage().ChangeIncome();
        }
    }

    void RemoveIncome() throws IOException {
        System.out.println("Which Income do you want to change? Choose by ID");
        new IncomeStorage().ListIncome();
        int choice = InputReader.BufferedReaderInt();
        IncomeStorage.incomeList.remove((choice - 1));
        new WriteIncomeToFile();
        new IncomeMenu();
    }

    public void ReadIncome() throws IOException {
        Gson gson = new Gson();
        Income[] incomes;
        FileReader fr = new FileReader(FileLocation.incomeLocation);
        incomes = gson.fromJson(fr, Income[].class);
        for (int i = 0; i < incomes.length; i++) {
            Income income = (Income) Array.get(incomes, i);
            IncomeStorage.incomeList.add(income);
        }
    }
}