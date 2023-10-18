package org.example;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class UserMenu extends User {
    public UserMenu() throws IOException {
        super();
        System.out.println("[1] Users name. \n[2] Add user. \n[3] Remove user.\n[4] Leave Menu.");
        String choice = InputReader.BufferedReaderOut();
            switch (choice) {
                case "1":
                    for (int i = 0; i < UserStorage.userList.size(); i++) {
                        System.out.println(UserStorage.userList.get(i).firstName + " " + UserStorage.userList.get(i).lastName);
                    }
                    new UserMenu();
                    case "2":
                        new UserStorage().CreateUser();
                        new UserMenu();
                    break;
                case "3":
                    new UserStorage().RemoveUser();
                    new UserMenu();
                    break;

                case "4":
                    System.out.println("Leave menu.");
                    new MainMenu();
                    break;
            }
        }
    }
