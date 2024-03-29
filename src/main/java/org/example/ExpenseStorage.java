package org.example;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
// ExpenseStorage is mirrored with IncomeStorage, meaning they are built the same but with other names.
public class ExpenseStorage{
    public static ArrayList<Expense> expenseList = new ArrayList<>();
    public static class WriteExpenseToFile {
        private Gson gson = new Gson();
        private FileWriter efw = new FileWriter(FileLocation.expenseLocation);

        public WriteExpenseToFile() throws IOException {
            gson.toJson(expenseList, efw);
            efw.flush();
        }

        public void CloseExpenseWriter() throws IOException {
            efw.close();
        }
    }
    public void CreateExpense() throws IOException {
        System.out.println("How many expenses do you want to add?");
        int eAmt = InputReader.IntOut();
        for (int i = 0; i < eAmt; i++) {
            System.out.println("Create an expense.");
            Expense expense = new Expense();
            System.out.println("Name your expense.");
            expense.setExpenseName(InputReader.StringOut());
            System.out.println("Amount.");
            expense.setAmount(InputReader.DoubleOut());
            System.out.println("Choose a category through a number: \n[1] Food\n[2] Gas\n[3] Rent\n[4] Fun\n[5] Other");
            expense.seteExpenseCategory(getExpenseCat());
            expenseList.add(expense);
            System.out.println("Expense added!");
            System.out.println("Name" + expenseList.get(expenseList.size()-1).expenseName + " Amount: " + expenseList.get(expenseList.size()-1).amount + " Category: " + expenseList.get(expenseList.size()-1).geteExpenseCategory().getCategory());
        }
        new ExpenseStorage.WriteExpenseToFile();
        new ExpensesMenu();
    }
    public ECategory getExpenseCat() throws IOException {
        String check = InputReader.StringOut();
        switch (check) {
            case "1": return ECategory.FOOD;
            case "2": return ECategory.GAS;
            case "3": return ECategory.RENT;
            case "4": return ECategory.FUN;
            case "5": return ECategory.OTHER;
            default :
                System.out.println("Please input a valid category.");
                return getExpenseCat();
        }
    }
    public void expenseReader() throws FileNotFoundException {
        Gson gson = new Gson();
        FileReader fr = new FileReader(FileLocation.expenseLocation);
        Expense[] expenses;
        expenses = gson.fromJson(fr, Expense[].class);
        for (int i = 0; i < expenses.length; i++) {
            Expense expense = (Expense) Array.get(expenses, i);
            ExpenseStorage.expenseList.add(expense);
        }
    }
    public void ChangeExpense() throws IOException {
        new ExpenseStorage().ListExpenses();
        System.out.println("Choose expense to change by ID.");
        int choice = InputReader.IntOut();
        choice = choice - 1;
        System.out.println("What do you want to change? [1] Name [2] Amount [3] Category");
        String changeChoice = InputReader.StringOut();
        switch (changeChoice){
            case "1": {
                System.out.println("Type the new name: ");
                ExpenseStorage.expenseList.get(choice).setExpenseName(InputReader.StringOut());
                new ExpensesMenu();
            }
            case "2": {
                System.out.println("Input new amount: ");
                ExpenseStorage.expenseList.get(choice).setAmount(InputReader.DoubleOut());
                new ExpensesMenu();
            }
            case "3":{
                System.out.println("Choose what category you want to change to.");
                System.out.println("[1] Food \n[2] Gas \n[3] Rent \n[4] Fun \n[5] Other");
                switch(choice) {
                    case 1: {
                        ExpenseStorage.expenseList.get(choice).seteExpenseCategory(ECategory.FOOD);
                        new ExpensesMenu();
                    }
                    case 2: {
                        ExpenseStorage.expenseList.get(choice).seteExpenseCategory(ECategory.GAS);
                        new ExpensesMenu();
                    }
                    case 3: {
                        ExpenseStorage.expenseList.get(choice).seteExpenseCategory(ECategory.RENT);
                        new ExpensesMenu();
                    }
                    case 4: {
                        ExpenseStorage.expenseList.get(choice).seteExpenseCategory(ECategory.FUN);
                        new ExpensesMenu();
                    }
                    case 5: {
                        ExpenseStorage.expenseList.get(choice).seteExpenseCategory(ECategory.OTHER);
                        new ExpensesMenu();
                    }
                    default:
                        System.out.println("Type a valid number.");
                        new ExpenseStorage().ChangeExpense();
                }
            }
            default:
                System.out.println("Type a valid number.");
                new ExpenseStorage().ChangeExpense();
        }
    }
    public void RemoveExpense() throws IOException {
        System.out.println("Which Income do you want to change? Choose by ID");
        new ExpenseStorage().ListExpenses();
        int choice =InputReader.IntOut();
        ExpenseStorage.expenseList.remove((choice-1));
        for(Expense expense : expenseList){
            int newID = Integer.parseInt(expense.id);
            if (newID <= 1){
                newID = Integer.parseInt("1");
                expense.id = String.valueOf(newID);
            } else {
                expense.id = String.valueOf(newID);
            }
        }
        new ExpenseStorage.WriteExpenseToFile();
        new IncomeMenu();
    }

    public void ListExpenses() {
        for (int i = 0; i < ExpenseStorage.expenseList.size(); i++) {
            System.out.println( (ExpenseStorage.expenseList.get(i).expenseName));
            System.out.println(("Amount: " + ExpenseStorage.expenseList.get(i).amount));
            System.out.println(("Category: " + ExpenseStorage.expenseList.get(i).ECategory.getCategory()));
            System.out.println("Date added: " + ExpenseStorage.expenseList.get(i).date);
            System.out.println("ID: " + expenseList.get(i).id);
        }
    }
    public static void ListByCatOther(){
        for (Expense expense : expenseList) {
            if (expense.geteExpenseCategory() == ECategory.OTHER) {
                System.out.println(expense.getExpenseName() + " " + expense.ECategory.getCategory() + " " + expense.amount);
                System.out.println("Id " + expense.id);
            }
        }
    }
    public static void ListByCatFood(){
        for (Expense expense : expenseList) {
            if (expense.geteExpenseCategory() == ECategory.FOOD) {
                System.out.println(expense.getExpenseName() + " " + expense.ECategory.getCategory() + " " + expense.amount);
                System.out.println("Id " + expense.id);
            }
        }
    }
    public static void ListByCatGas(){
        for (Expense expense : expenseList) {
            if (expense.geteExpenseCategory() == ECategory.GAS) {
                System.out.println(expense.getExpenseName() + " " + expense.ECategory.getCategory() + " " + expense.amount);
                System.out.println("Id " + expense.id);
            }
        }
    }
    public static void ListByCatFun(){
        for (Expense expense : expenseList) {
            if (expense.geteExpenseCategory() == ECategory.FUN) {
                System.out.println(expense.getExpenseName() + " " + expense.ECategory.getCategory() + " " + expense.amount);
                System.out.println("Id " + expense.id);
            }
        }
    }
    public static void ListByCatRent(){
        for (Expense expense : expenseList) {
            if (expense.geteExpenseCategory() == ECategory.RENT) {
                System.out.println(expense.getExpenseName() + " " + expense.ECategory.getCategory() + " " + expense.amount);
                System.out.println("Id " + expense.id);
            }
        }
    }
    public void SearchExpense() throws IOException {
        System.out.println("Search for expense by inputting name of income or id");
        String check = InputReader.StringOut();
        for (Expense expense:
                ExpenseStorage.expenseList) {
            if (check.equals(expense.expenseName)){
                System.out.println(expense.expenseName + " \n" + expense.id + " \n" + expense.amount + " \n" + expense.ECategory);
            }else if (check.equals(expense.id)){
                System.out.println(expense.expenseName + " \n" + expense.id + " \n" + expense.amount + " \n" + expense.ECategory);
            }else {
                System.out.println("Couldn't find anything that matched.");
            }
            new IncomeMenu();
        }
    }
}
