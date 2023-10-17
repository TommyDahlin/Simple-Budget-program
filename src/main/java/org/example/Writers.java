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
}

