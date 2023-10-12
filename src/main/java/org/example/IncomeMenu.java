package org.example;

import java.io.*;

public class IncomeMenu {
    public IncomeMenu() throws IOException {
        System.out.println("[1] Add Source(s) of income.\n[2] Remove Source of income.\n[3] List income.\n[4] Go back to main menu.");
        String choice = InputReader.BufferedReaderOut();
        switch (choice) {
            case "1" -> {
                System.out.println("How many incomes do you want to add?");
                int iAmt = Integer.parseInt(InputReader.BufferedReaderOut());
                for (int i = 0; i < iAmt; i++) {
                    new CreateIncome();
                }
                new IncomeMenu();
            }
            case "2" -> System.out.println("Remove income object");
            case "3" -> {
                if (IncomeStorage.incomeList == null){
                    System.out.println("There are no incomes added. \n");
                    new IncomeMenu();
                }
                for (int i = 0; i < IncomeStorage.incomeList.size(); i++) {
                    System.out.println(IncomeStorage.incomeList.get(i).incomeName);
                    System.out.println(IncomeStorage.incomeList.get(i).incomeDouble);
                    System.out.println(IncomeStorage.incomeList.get(i).eIncomeCategory.getCategory());
                }

            }
            case "4" -> new MainMenu();
        }
    }
}
