package org.example;
import java.util.Scanner;
public class OneScanner {
    public static String OneScannerIn(){
        Scanner oneScanner = new Scanner(System.in);
        String oneScannerOut = oneScanner.nextLine();
        return oneScannerOut;
    }
}
