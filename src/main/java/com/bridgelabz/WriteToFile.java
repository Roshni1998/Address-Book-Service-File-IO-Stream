package com.bridgelabz;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("AddressBook.txt");
            writer.write("first name, last name, address, city, state, zip code, mobile No, emailId");
            writer.write("\n[Roshni, Mali, Shastri Circle, Udaipur, Rajasthan, 12345, 9898989898, roshni@gmail.com]");
            System.out.println("Contact added Successfully!!");
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
