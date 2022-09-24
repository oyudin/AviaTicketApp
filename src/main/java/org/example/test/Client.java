package org.example.test;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Client {

    private String fName;
    private String lName;
    private int yearOfBirth;
    private int age = 2022 - yearOfBirth;

    public Client(String name, String lName, int yearOfBirth) {
        this.fName = name;
        this.lName = lName;
        this.yearOfBirth = yearOfBirth;
    }
}
