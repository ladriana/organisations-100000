package ro.scoalainformala;

public class Program {
    public static void main(String[] args) {
        OrganizationsData organizations = new OrganizationsData();
        organizations.loadDataFromFile("D:\\java\\teme\\organizations-100000\\organizations-100000.csv");

        System.out.println(organizations.getNumberOfRecords());
    }
}
