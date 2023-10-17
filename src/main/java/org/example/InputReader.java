package org.example;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputReader {
    public static String BufferedReaderOut() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String bfInput = input.readLine();
        return bfInput;
    }
    public static int BufferedReaderInt() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int bfInput = Integer.parseInt(input.readLine());
        return bfInput;
    }
}
