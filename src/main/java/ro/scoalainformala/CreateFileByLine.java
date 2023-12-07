package ro.scoalainformala;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreateFileByLine {
    private static final String OUT_TEXT_FILE_PATH = "C:\\Users\\acron\\Documents\\cursJAVA\\TEME\\organisations-100000\\organizations-modifieddddd.txt";


    public static void main(String[] args) {

        CreateFileByLine createFile = new CreateFileByLine();

        OrganizationsData organizations = new OrganizationsData();
        organizations.loadDataFromFile("C:\\Users\\acron\\Documents\\cursJAVA\\TEME\\organisations-100000\\organizations-100000.csv");

        System.out.println("Companies with less than 100 employees sorted by founded year:");
        ArrayList<String> listY = organizations.sortedByFounded();
        listY.forEach(System.out::println);

        createFile.writeTextToFile(listY);
    }

    public void writeTextToFile(ArrayList<String> list) {

        try (Writer w = new FileWriter(OUT_TEXT_FILE_PATH);) {

            OrganizationsData organizations = new OrganizationsData();
            organizations.loadDataFromFile("C:\\Users\\acron\\Documents\\cursJAVA\\TEME\\organisations-100000\\organizations-100000.csv");
            list = organizations.sortedByFounded();
            for (String s : list) {
                w.write(s + System.lineSeparator());
            }

            System.out.println("The information was succesfully written to a file");

        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Something went wrong");
        }
    }
}

