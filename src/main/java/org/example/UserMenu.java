package org.example;

import java.io.IOException;

public class UserMenu extends User {
    public UserMenu() throws IOException {
        super();
        System.out.println("[1] Users name. \n[2] Add user. \n[3] Remove user.\n[4] Leave Menu.");
        String choice = InputReader.BufferedReaderOut();
            switch (choice) {
                case "1":
                    System.out.println(getFirstName()+ " "+ getLastName() );
                    new UserMenu();
                    case "2":
                    System.out.println("Add user.\nInput your First name.");
                    String firstname = InputReader.BufferedReaderOut();
                    System.out.println("Input your last name.");
                    String lastname = InputReader.BufferedReaderOut();
                    User user = new User(firstname, lastname);
                    users.add(user);
                    System.out.println(user.firstName + " " + user.lastName);
                    new UserMenu();
                    break;
                case "3":
                    System.out.println("Remove user.");
                    new UserMenu();
                    break;

                case "4":
                    System.out.println("Leave menu.");
                    new MainMenu();
                    break;
            }
        }
    }
