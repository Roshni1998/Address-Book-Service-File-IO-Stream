package com.csvfilereaderwriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVWriter {

    public void writeCSV(String filePath) {
        List<AddressBook> addressBooks = new ArrayList<>();

        AddressBook addressBook = new AddressBook();
        addressBook.setId(1);
        addressBook.setFirstName("Rohit");
        addressBook.setLastName("Sharma");
        addressBook.setAddress("Malviya nagar");
        addressBook.setCity("Agra");
        addressBook.setState("Uttar Pradesh");
        addressBook.setZipNo("345677");
        addressBook.setEmailId("rohit@gmail.com");
        addressBook.setMobileNo("9090909090");
        addressBooks.add(addressBook);

        addressBook = new AddressBook();
        addressBook.setId(2);
        addressBook.setFirstName("Ankita");
        addressBook.setLastName("Deshmukh");
        addressBook.setAddress("Samriddhi nagar");
        addressBook.setCity("Mumbai");
        addressBook.setState("Maharastra");
        addressBook.setZipNo("456766");
        addressBook.setMobileNo("9898989898");
        addressBook.setEmailId("ankita@gmail.com");
        addressBooks.add(addressBook);

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filePath);
            fileWriter.append("First Name, Last Name, Address, City, State, ZipCode, MobileNo, EmailId\n");
            for (AddressBook address : addressBooks) {
                fileWriter.append(String.valueOf(address.getId()));
                fileWriter.append(",");
                fileWriter.append(address.getFirstName());
                fileWriter.append(",");
                fileWriter.append(address.getLastName());
                fileWriter.append(",");
                fileWriter.append(address.getAddress());
                fileWriter.append(",");
                fileWriter.append(address.getCity());
                fileWriter.append(",");
                fileWriter.append(address.getState());
                fileWriter.append(",");
                fileWriter.append(address.getZipNo());
                fileWriter.append(",");
                fileWriter.append(address.getMobileNo());
                fileWriter.append(",");
                fileWriter.append(address.getEmailId());
                fileWriter.append("\n");
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
