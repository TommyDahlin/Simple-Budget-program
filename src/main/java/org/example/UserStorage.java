package org.example;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// user handler class, has all methods for the User objects.
public class UserStorage {
    public static ArrayList<User> userList = new ArrayList<>();
         Gson gson = new Gson();
         FileWriter ufw = new FileWriter(FileLocation.userLocation);

         void WriteUserToFile() throws IOException {
            gson.toJson(UserStorage.userList, ufw);
            ufw.flush();
        }

    public UserStorage() throws IOException {
    }

    public void CloseUserWriter() throws IOException {
            ufw.close();
        }
        public void CreateUser() throws IOException {
            User user = new User();
            System.out.println("Add user.\nInput your First name.");
            user.setFirstName(InputReader.StringOut());
            System.out.println("Input your last name.");
            user.setLastName(InputReader.StringOut());

            System.out.println(user.firstName + " " + user.lastName);
            List<User> userList = new UserStorage().userList;
            userList.add(user);
        }
        public void RemoveUser() throws IOException {
            System.out.println("Remove user.");
            for (int i = 0; i < UserStorage.userList.size(); i++) {
                System.out.println("Remove user through id.");
                System.out.println("Id: " + (i+1) + UserStorage.userList.get(i).firstName + UserStorage.userList.get(i).lastName);
            }
            System.out.println("Who do you want to remove?");
            int removeUser = InputReader.IntOut();
            removeUser = removeUser - 1;
            System.out.println("Are you sure you want to remove " + UserStorage.userList.get(removeUser).firstName + "\ny/n?");
            if (Objects.equals(InputReader.StringOut(), "y"))
                UserStorage.userList.remove(removeUser);
            else if (Objects.equals(InputReader.StringOut(), "n")){
                System.out.println("Operation aborted.");
                new UserMenu();
            }
            else {
                System.out.println("Input y or n. (Case sensitive.)");
                RemoveUser();
            }
        }
    }
