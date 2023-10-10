package org.example;

import com.google.gson.Gson;

import java.io.*;

public class IncomeMenu extends Income {
    public IncomeMenu() throws IOException {
        super();
        System.out.println("[1] Add Source of income.\n[2] Remove Source of income.\n[3] Change amount of money from income.\n[4] Go back to main menu.");
        String choice = InputReader.BufferedReaderOut();
        IncomeStorage incomeStorage = new IncomeStorage();
        switch (choice){
            case "1" : {
                System.out.println("What type of income is it? \n [1] Wage. \n [2] Services. \n [3] Other.");
                String incometype = InputReader.BufferedReaderOut();
                switch (incometype){
                    case "1":
                        new IncomeStorage().IncomeStorageWage();
                        new IncomeMenu();
                        break;
                    case "2":
                        System.out.println("What is the income amount?");
                        incomeDouble = Double.parseDouble(InputReader.BufferedReaderOut());
                        System.out.println("what do you want to name the income?");
                        incomeName = InputReader.BufferedReaderOut();
                        incomeDouble = Double.parseDouble(String.valueOf(this.incomeDouble));
                        Income income1 = new Income(incomeDouble, incomeName, EIncomeCategory.SERVICES);
                        break;

                    case "3":
                        System.out.println("What is the income amount?");
                        incomeDouble = Double.parseDouble(InputReader.BufferedReaderOut());
                        System.out.println("what do you want to name the income?");
                        incomeName = InputReader.BufferedReaderOut();
                        Income income2 = new Income(this.incomeDouble, incomeName, EIncomeCategory.OTHER);
                        break;
                }
            }
            case "2" :{
                System.out.println("remove income");
                break;
            }
            case "3" : {
                System.out.println("Change income.");
                break;
            }
            case "4" : {
                System.out.println("Go back to main menu.");
                new IncomeStorage().IncomeToFile();
                new MainMenu();
            }
        }
    }
}
