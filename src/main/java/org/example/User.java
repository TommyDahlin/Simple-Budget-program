package org.example;
import java.io.IOException;


public class User {
    public String firstName;
    public String lastName;

    public User(String firstName, String lastName) throws IOException {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User() throws IOException {
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}
