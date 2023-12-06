package ro.scoalainformala;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class CreateFile {
    private static final String OUT_TEXT_FILE_PATH = "C:\\Users\\acron\\Documents\\cursJAVA\\TEME\\organisations-100000\\organizations-modified.txt";


    public static void main(String[] args) {

        CreateFile createFile = new CreateFile();

        OrganizationsData organizations = new OrganizationsData();
        organizations.loadDataFromFile("C:\\Users\\acron\\Documents\\cursJAVA\\TEME\\organisations-100000\\organizations-100000.csv");

        System.out.println("Companies with less than 100 employees sorted by founded year:");
        ArrayList<String> listY = organizations.sortedByFounded();
        listY.forEach(System.out::println);
        createFile.writeObjectToFile(listY);
    }

    public void writeObjectToFile(Object o) {
        try {
            FileOutputStream fileOut = new FileOutputStream(OUT_TEXT_FILE_PATH);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(o);
            objectOut.close();
            System.out.println("The Object  was succesfully written to a file");

        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Something went wrong");
        }


    }
}

