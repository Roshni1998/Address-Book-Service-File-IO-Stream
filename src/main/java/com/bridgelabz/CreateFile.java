package com.bridgelabz;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File addressBook = new File("AddressBook.txt");
            if (addressBook.createNewFile()) {
                System.out.println("File Created : " + addressBook.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
