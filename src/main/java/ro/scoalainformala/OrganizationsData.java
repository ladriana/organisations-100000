package ro.scoalainformala;

import ro.scoalainformala.comparators.CompanyComparatorByCounty;
import ro.scoalainformala.comparators.CompanyComparatorByYearFounded;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class OrganizationsData {
    // private static final String TEXT_FILE_PATH = "C:\Users\acron\Documents\cursJAVA\TEME\organisations-100000\organizations-100000.csv";
    private ArrayList<OrganizationRecord> organisations;

    public OrganizationsData() {
        organisations = new ArrayList<OrganizationRecord>();
    }

    public int getNumberOfRecords() {
        return organisations.size();
    }

    public OrganizationRecord getRecordNumber(int i) {
        return organisations.get(i);
    }

    public void loadDataFromFile(String TEXT_FILE_PATH) {

        try {
            BufferedReader br = new BufferedReader(new FileReader(TEXT_FILE_PATH));
            String lineOfText = null;
            OrganizationRecord record;

            lineOfText = br.readLine();
            int k = 0;
            while ((lineOfText = br.readLine()) != null) {

                boolean t = false;
                if (lineOfText.indexOf("\"") > 1) {
                    String[] x = lineOfText.split("\"");
                    x[1] = x[1].replace(",", ".");
                    lineOfText = x[0] + x[1] + x[2];
                    t = true;
                }

                String[] results = lineOfText.split(",");

                int index = Integer.parseInt(results[0]);
                String organizationId = results[1];

                String name = "";
                if (t = true) {
                    name = results[2].replace(".", ",");
                } else {
                    name = results[2];
                }

                String website = results[3];
                String country = results[4];
                String description = results[5];
                int founded = Integer.parseInt(results[6]);
                String industry = results[7];
                int numberEmployees = Integer.parseInt(results[8]);

                record = new OrganizationRecord(index, results[1], results[2], results[3],
                        results[4], results[5], founded, results[7], numberEmployees);

                organisations.add(record);
            }
        } catch (FileNotFoundException e) {
            System.err.println("The file was not found on disk.");
        } catch (IOException e) {
            System.err.println("Could not read from file.");
        }
    }

    public void companyR() {
        organisations.stream()
                .filter(c -> c.getName().charAt(0) == 'R')
                .forEach(c -> System.out.println(c.getName()));
    }

    public void namesAndCountryYears() {
        organisations.stream()
                .filter(c -> c.getFounded() > 2010 && c.getFounded() < 2020)
                .forEach(c -> System.out.println(c.getName() + " " + c.getCountry()));
    }

    public long countCompanies() {
        long l = organisations.stream()
                .filter(c -> c.getNumberEmployees() > 9000)
                .count();
        return l;
    }

    public ArrayList<String> itIndustry() {
        return (ArrayList<String>) organisations.stream()
                //.filter(c -> Objects.equals(c.getIndustry(), "Information Technology / IT"))
                .filter(c-> "Information Technology / IT".equals(c.getIndustry()))
                .map((OrganizationRecord x) -> x.getNameYear())
                .collect(Collectors.toList());

    }

    public ArrayList<String> sortedByName() {
        return (ArrayList<String>) organisations.stream()
                .filter(c -> c.getNumberEmployees() < 100)
                .map((OrganizationRecord x) -> x.getNameCountryWeb())
                .sorted()
                .collect(Collectors.toList());
    }

   public ArrayList<String> sortedByCountry() {
        return (ArrayList<String>) organisations.stream()
                .filter(c -> c.getNumberEmployees() < 100)
                //.sorted((s1, s2) -> s1.getCountry().compareTo(s2.getCountry())
                .sorted(new CompanyComparatorByCounty())
                .map(OrganizationRecord::getNameCountryWeb)
                .collect(Collectors.toList());
    }
    public ArrayList<String> sortedByFounded() {
        return (ArrayList<String>) organisations.stream()
                .filter(c -> c.getNumberEmployees() < 100)
               // .sorted((s1, s2) -> s1.getFounded()-s2.getFounded())
                .sorted(new CompanyComparatorByYearFounded())
                .map(OrganizationRecord::getNameCountryFounded)
                .collect(Collectors.toList());
    }
}

