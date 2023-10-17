package org.example;
import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;

// All writers are created and used from here.
public class Writers {
    public static class WriteUserToFile extends User {
        private Gson gson = new Gson();
        private FileWriter ufw = new FileWriter(FileLocation.userLocation);

        public WriteUserToFile() throws IOException {
            gson.toJson(UserStorage.userList, ufw);
            ufw.flush();
        }
        public void CloseUserWriter() throws IOException {
            ufw.close();
        }
    }
    public static class WriteIncomeToFile {
        private Gson gson = new Gson();
        private FileWriter ifw = new FileWriter(FileLocation.incomeLocation);
        public WriteIncomeToFile() throws IOException {
            gson.toJson(IncomeStorage.incomeList, ifw);
            ifw.flush();
        }
        public void CloseIncomeWriter() throws IOException {
            ifw.close();
        }
    }
    public static class WriteExpenseToFile {
        private Gson gson = new Gson();
        private FileWriter efw = new FileWriter(FileLocation.expenseLocation);
        public WriteExpenseToFile() throws IOException {
            gson.toJson(ExpenseStorage.expenseList, efw);
            efw.flush();
        }
        public void CloseExpenseWriter() throws IOException {
            efw.close();
        }
    }
}

