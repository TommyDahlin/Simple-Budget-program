package org.example;

import java.util.ArrayList;

public class UserMenu extends User {
    public UserMenu(){
        super();
        boolean isRunning = true;
        System.out.println("[1]. Users name. \n[2] Add user. \n[3] Remove user.\n[4] Leave Menu.");
        String choice = OneScanner.OneScannerIn();
        while (isRunning) {
            switch (choice) {
                case "1":
                    System.out.println("User Firstname + User Lastname");
                    isRunning = false;
                    break;
                case "2":
                    System.out.println("Add user.\nInput your First name.");
                    String firstname = String.valueOf(new OneScanner());
                    System.out.println("Input your last name.");
                    String lastname = String.valueOf(new OneScanner());
                    setFirstName(firstname);
                    setLastName(lastname);
                    User user = new User(getFirstName(), getLastName());
                    users.add(user);
                    System.out.println(users);
                    isRunning=false;
                    break;
                case "3":
                    System.out.println("Remove user.");
                    isRunning=false;
                    break;
                case "4":
                    System.out.println("Leave menu.");
                    new MainMenu();
                    isRunning = false;
            }
        }
    }
}
