package ro.scoalainformala;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final String TEXT_FILE_PATH = "D:\\java\\teme\\organizations-100000\\organizations-100000.csv";
    public static void main(String[] args) {
        List<OrganizationRecord> organisationsList = new ArrayList<>();
    try {
        BufferedReader br = new BufferedReader(new FileReader(TEXT_FILE_PATH));
        String lineOfText = null;
        while ((lineOfText = br.readLine()) != null) {

           // organisationsList.add(lineOfText);
        }
    } catch (FileNotFoundException e) {
        System.err.println("The file was not found on disk.");
    } catch (IOException e) {
        System.err.println("Could not read from file.");
    }

    }
}