package org.example;
import java.io.*;

public class IncomeMenu {
    // Simple Menu for incomes.
    public IncomeMenu() throws IOException {
        System.out.println("[1] Add Source(s) of income.\n[2] Remove Source of income.\n[3] List income.\n[4] Change Income.\n[5] Search for income. \n[6] Go back to main menu.");
        String choice = InputReader.StringOut();
        switch (choice) {
            case "1" -> {
                new IncomeStorage().CreateIncome();
                new IncomeMenu();
            }
            case "2" -> new IncomeStorage().RemoveIncome();
            case "3" -> {
                if (IncomeStorage.incomeList == null){
                System.out.println("There are no incomes added. \n");
                new IncomeMenu();
            } else {
                    System.out.println("Make your choice: \n[1] List with full details. \n[2] List by Category: Wage \n[3] List by Category: Services \n[4] List by category: Other");
                    choice = InputReader.StringOut();
                    switch (choice){
                        case "1" :
                            System.out.println("List with all details.");
                            new IncomeStorage().ListIncomeFull();
                            new IncomeMenu();
                        case "2" :
                            System.out.println("List by Category Wage");
                            new IncomeStorage().ListByCatWage();
                            new IncomeMenu();
                        case "3" :System.out.println("List by Category Services");
                            new IncomeStorage().ListByCatServices();
                            new IncomeMenu();
                        case "4" : System.out.println("List by Category Other");
                            new IncomeStorage().ListByCatOther();
                        new IncomeMenu();
                    }

                }
            }
            case "4" -> new IncomeStorage().ChangeIncome();
            case "5" -> new IncomeStorage().SearchIncome();
            case "6" -> new MainMenu();
            default-> {
                System.out.println("You have to input a valid choice.");
                new IncomeMenu();
            }
        }
    }
}
