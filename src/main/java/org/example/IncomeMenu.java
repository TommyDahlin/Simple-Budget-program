package org.example;

import java.io.*;

public class IncomeMenu extends Income {
    public IncomeMenu() throws IOException {
        System.out.println("[1] Add Source of income.\n[2] Remove Source of income.\n[3] Change amount of money from income.");
        String choice = InputReader.BufferedReaderOut();
        switch (choice){
            case "1" : {
                System.out.println("What type of income is it? \n [1] Wage. \n [2] Services. \n [3] Other.");
                String incometype = InputReader.BufferedReaderOut();
                switch (incometype){
                    case "1": Income income = new Income();//Wage
                    case "2": Income income1 = new Income();//Services
                    case "3": Income income2 = new Income();//Other
                }
                System.out.println("How much is the income?");
                InputReader.BufferedReaderOut();
                break;
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
                new MainMenu();
            }
        }
    }
}
