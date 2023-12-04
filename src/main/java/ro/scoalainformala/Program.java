package ro.scoalainformala;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        OrganizationsData organizations = new OrganizationsData();
        organizations.loadDataFromFile("D:\\java\\teme\\organizations-100000\\organizations-100000.csv");
      //  System.out.println(organizations.getNumberOfRecords());
        System.out.println("Names of the companies which are from a country starting with the letter 'R':");
       //organizations.companyR();
        System.out.println("Names and countries of the companies founded between 2010 and 2020:");
        //organizations.namesAndCountryYears();
        System.out.println("Number of companies whose number of employees are greater than 9000:");
        //System.out.println(organizations.countCompanies());

        System.out.println("it industry:");
        System.out.println(organizations.itIndustry());



    }
}
