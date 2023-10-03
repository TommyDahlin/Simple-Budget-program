package org.example;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        // init gson to be able to make a new json file
        Gson gson = new Gson();

        // set filepath and filename
        String filename = "src/main/user.json";
        FileWriter fw = new FileWriter(filename);

        //Arraylist for users to write to the file
        ArrayList<User> userList = new ArrayList<>();
        userList.add(new User("per", 1));
        userList.add(new User("Harald", 2));
        userList.add(new User("Karlsson", 3));
        // initializing a json file with parameters of what (userlist) to the file using filewriter.
        gson.toJson(userList, fw);
        // filewriter has to be closed before it can read.
        fw.close();
        // initializing a User array with user objects with 'null' so it has nothing to fight with
        User[] users = null;
        try {
            FileReader fr = new FileReader(filename); //init filereader

            users = gson.fromJson(fr, User[].class); //fills the array with users from the .json file

        } catch (IOException ex){
            ex.printStackTrace(); //catch ioexception if something is wrong with your objects
        }
        System.out.println("User data: ");
        for (User user : users) {
            System.out.println(user.getId() + " " + user.getName());

        }

    }
}