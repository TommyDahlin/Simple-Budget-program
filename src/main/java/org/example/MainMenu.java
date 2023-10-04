package org.example;

public class MainMenu extends OneScanner {
    public MainMenu(){
        boolean isRunning = true;
        System.out.println("Welcome to the budget program.\nMake your choice.\n[1] Budget.\n[2] Income.\n[3] Expenses");
        String choice = String.valueOf(OneScanner());
        while (isRunning){
            switch (choice){
                case "1":
                    System.out.println("Budget.");
                    new BudgetMenu();
                    isRunning = false;
                    break;
                case "2":
                    System.out.println("Income.");
                    new IncomeMenu();
                    isRunning = false;
                    break;
                case "3":
                    System.out.println("Expenses.");
                    new ExpensesMenu();
                    isRunning = false;
                    break;
                case "4":
                    System.out.println("User");
                    isRunning = false;
                    break;
            }
        }
    }
}
