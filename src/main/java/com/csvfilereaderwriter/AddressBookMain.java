package com.csvfilereaderwriter;

public class AddressBookMain {

    public static void main(String[] args) {
        String filePath = "AddressBook.csv";
        CSVWriter csvwriter = new CSVWriter();
        CSVReader csvReader = new CSVReader();

        System.out.println("Writing Csv file : " + filePath);
        csvwriter.writeCSV(filePath);

        System.out.println("Reading Csv file : " + filePath);
        csvReader.readCSV(filePath);
    }
}
