package org.example;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ScanFile {
    public void ScanFileIn() throws IOException {
        //Inits the Gson, filereader and Income Array.

            Gson gson = new Gson();

            FileReader fr = new FileReader(FileLocation.userLocation);
            User[] users;
            users = gson.fromJson(fr, User[].class);
            for (int i = 0; i < users.length; i++){
                User user = (User) Array.get(users, i);
                UserStorage.userList.add(user);
            }
        }
        }

