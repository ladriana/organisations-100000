package ro.scoalainformala;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OrganizationsData {
   // private static final String TEXT_FILE_PATH = "D:\\java\\teme\\organizations-100000\\organizations-100000.csv";
    private ArrayList<OrganizationRecord> organisations;

    public OrganizationsData() {
        organisations = new ArrayList<OrganizationRecord>();        ;
    }

    public int getNumberOfRecords() {
        return organisations.size();
    }

    public OrganizationRecord getRecordNumber (int i) {
        return organisations.get(i);
    }

    public void loadDataFromFile(String TEXT_FILE_PATH) {


        try {
            BufferedReader br = new BufferedReader(new FileReader(TEXT_FILE_PATH));
            String lineOfText = null;
            OrganizationRecord record;
            br.readLine();
            while ((lineOfText = br.readLine()) != null) {
                String[] results = lineOfText.split(",");
                int index = Integer.parseInt(results[0]);
                String organizationId = results[1];
                String name = results[2];
                String website = results[3];
                String country = results[4];
                String description = results[5];
                int founded= Integer.parseInt(results[6]);
                String industry = results[7];
                int numberEmployees = Integer.parseInt(results[8]);

                record = new OrganizationRecord(index, results[1], results[2],results[3],
                        results[4],results[5],founded, results[7], numberEmployees);

                organisations.add(record);



            }
        } catch (
                FileNotFoundException e) {
            System.err.println("The file was not found on disk.");
        } catch (
                IOException e) {
            System.err.println("Could not read from file.");
        }
    }
}
