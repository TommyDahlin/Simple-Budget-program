package org.example;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputReader {
    public static Double DoubleOut(){
    Scanner scanner = new Scanner(System.in);
    double buh = 0;
    while (!scanner.hasNextDouble()){
        scanner.nextLine();
    }
    if (scanner.hasNextDouble()){
        buh = scanner.nextDouble();
        }
        scanner.nextLine();
    return buh;
    }
    public static int IntOut(){
        Scanner scanner = new Scanner(System.in);
        int buh = 0;
        while (!scanner.hasNextInt()){
            scanner.nextLine();
        }
        if (scanner.hasNextInt()){
            buh = scanner.nextInt();
        }
        scanner.nextLine();
        return buh;
    }
    public static String StringOut(){
        Scanner scanner = new Scanner(System.in);
        String buh = scanner.nextLine();
        return buh;
    }
}
