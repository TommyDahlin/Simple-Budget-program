package org.example;

public class UserMenu {
    public UserMenu(){
        System.out.println("[1]. Users name. \n[2] Add user. \n[3] Remove user.");
        String choice = String.valueOf(new OneScanner());
        switch (choice){
            case "1":
                System.out.println("User Firstname + User Lastname");
            case "2" :
                System.out.println("Add user.");
            case "3" :
                System.out.println("Remove user.");
        }
    }
}
