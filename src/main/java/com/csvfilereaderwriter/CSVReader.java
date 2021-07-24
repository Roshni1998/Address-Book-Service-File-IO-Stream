package com.csvfilereaderwriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {

    public void readCSV (String filePath) {
        BufferedReader reader = null;
        try {
            List<AddressBook> addressBooks = new ArrayList<>();
            String line = "";
            reader = new BufferedReader(new FileReader(filePath));
            reader.readLine();

            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                if (fields.length > 0) {
                    AddressBook addressBook = new AddressBook();
                    addressBook.setId(Integer.parseInt(fields[0]));
                    addressBook.setFirstName(fields[1]);
                    addressBook.setLastName(fields[2]);
                    addressBook.setAddress(fields[3]);
                    addressBook.setCity(fields[4]);
                    addressBook.setState(fields[5]);
                    addressBook.setZipNo(fields[6]);
                    addressBook.setEmailId(fields[7]);
                    addressBook.setMobileNo(fields[8]);
                    addressBooks.add(addressBook);
                }
            }
            for (AddressBook address : addressBooks) {
                System.out.printf("[id=%d, firstName=%s, lastName=%s, address=%s, city=%s, state=%s, zipCode=%s,"
                                +"mobileNo=%s, emailId=%s,]\n", address.getId(), address.getFirstName(),
                        address.getLastName(), address.getAddress(), address.getCity(), address.getState(),
                        address.getZipNo(), address.getMobileNo(), address.getEmailId());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
