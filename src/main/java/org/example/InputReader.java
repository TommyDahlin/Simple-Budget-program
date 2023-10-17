package org.example;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputReader {
    public static String BufferedReaderOut() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        return input.readLine();
    }
    public static int BufferedReaderInt() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(input.readLine());
        }
        public static double BufferedReaderDouble() throws IOException{
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            return Double.parseDouble(input.readLine());
    }
}