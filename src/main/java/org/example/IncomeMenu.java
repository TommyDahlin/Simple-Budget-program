package org.example;

import java.io.*;

public class IncomeMenu {
    public IncomeMenu() throws IOException {
        System.out.println("[1] Add Source of income.\n[2] Remove Source of income.\n[3] Change amount of money from income.");
        String choice = InputReader.BufferedReaderOut();
        switch (choice){
            case "1" : {
                System.out.println("add source of income.");
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
