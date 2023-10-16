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
                        User user = new User();
                        System.out.println("Add user.\nInput your First name.");
                        user.setFirstName(InputReader.BufferedReaderOut());
                        System.out.println("Input your last name.");
                        user.setLastName(InputReader.BufferedReaderOut());

                    System.out.println(user.firstName + " " + user.lastName);
                        List<User> userList = new UserStorage().userList;
                        userList.add(user);
                        new UserMenu();
                    break;
                case "3":
                    System.out.println("Remove user.");
                    for (int i = 0; i < UserStorage.userList.size(); i++) {
                        System.out.println("Remove user through id.");
                        System.out.println("Id: " + (i+1) + UserStorage.userList.get(i).firstName + UserStorage.userList.get(i).lastName);
                        System.out.println("Who do you want to remove?");
                        int removeUser = Integer.parseInt(InputReader.BufferedReaderOut());
                        System.out.println("Are you sure you want to remove " + UserStorage.userList.get(removeUser).firstName + "\nY/N?");
                        if (Objects.equals(InputReader.BufferedReaderOut(), "y"))
                        UserStorage.userList.remove(removeUser);
                        else {
                            new UserMenu();
                        }

                    }
                    new UserMenu();
                    break;

                case "4":
                    System.out.println("Leave menu.");
                    new MainMenu();
                    break;
            }
        }
    }
