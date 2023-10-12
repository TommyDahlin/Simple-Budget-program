package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class ScanFile {
    public void ScanFileIn() throws IOException {
        Gson gson = new Gson();
        Income[] incomes = null;
        FileReader fr = new FileReader(FileLocation.incomeLocation);
        incomes = gson.fromJson(fr, Income[].class);
        for (Income income:incomes) {
            IncomeStorage.incomeList = Arrays.asList(incomes);

            fr = new FileReader(FileLocation.expenseLocation);
            Expense[] expenses = null;
            expenses = gson.fromJson(fr, Expense[].class);
            for (Expense expense : expenses) {
                ExpenseStorage.expenseList = Arrays.asList(expenses);
            }
        }
        }
    }

