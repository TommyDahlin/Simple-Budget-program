package org.example;

public class MainMenu {
    public MainMenu(){
        boolean isRunning = true;
        System.out.println("Welcome to the budget program.\nMake your choice.\n[1] Budget.\n[2] Income.\n[3] Expenses.\n[4] User Options.");
        while (isRunning){
            String choice = OneScanner.OneScannerIn();
            switch (choice) {
                case "1" -> {
                    System.out.println("Budget.");
                    new BudgetMenu();
                    isRunning = false;
                }
                case "2" -> {
                    System.out.println("Income.");
                    new IncomeMenu();
                    isRunning = false;
                }
                case "3" -> {
                    System.out.println("Expenses.");
                    new ExpensesMenu();
                    isRunning = false;
                }
                case "4" -> {
                    System.out.println("User");
                    new UserMenu();
                    isRunning = false;
                }
            }
        }
    }
}
