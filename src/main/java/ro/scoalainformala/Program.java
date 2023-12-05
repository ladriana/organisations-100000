package ro.scoalainformala;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {
        OrganizationsData organizations = new OrganizationsData();
        organizations.loadDataFromFile("C:\\Users\\acron\\Documents\\cursJAVA\\TEME\\organisations-100000\\organizations-100000.csv");
      //  System.out.println(organizations.getNumberOfRecords());
        System.out.println("Names of the companies which are from a country starting with the letter 'R':");
       //organizations.companyR();
        System.out.println("Names and countries of the companies founded between 2010 and 2020:");
        //organizations.namesAndCountryYears();
        System.out.println("Number of companies whose number of employees are greater than 9000:");
        //System.out.println(organizations.countCompanies());

        System.out.println("Companies from it industry:");
        //ArrayList<String> itList = organizations.itIndustry();
       // itList.forEach(System.out::println);

        System.out.println("Companies with less than 100 employees:");
        //ArrayList<String> listE = organizations.sortedByName();
       // listE.forEach(System.out::println);

        System.out.println("Companies with less than 100 employees sorted by country:");
       // ArrayList<String> listC= organizations.sortedByCountry();
        //listC.forEach(System.out::println);

        System.out.println("Companies with less than 100 employees sorted by founded year:");
        ArrayList<String> listY = organizations.sortedByFounded();
        listY.forEach(System.out::println);

    }
}
