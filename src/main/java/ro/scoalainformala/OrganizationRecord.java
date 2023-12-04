package ro.scoalainformala;

public class OrganizationRecord {
    public int index;
    private String organizationId;
    private String name;
    private String website;
    private  String country;
    private String description;
    private int founded;
    private String industry;
    private  int numberEmployees;

    @Override
    public String toString() {
        return "OrganizationRecord{" +
                "index=" + index +
                ", organizationId='" + organizationId + '\'' +
                ", name='" + name + '\'' +
                ", website='" + website + '\'' +
                ", country='" + country + '\'' +
                ", description='" + description + '\'' +
                ", founded=" + founded +
                ", industry='" + industry + '\'' +
                ", numberEmployees=" + numberEmployees +
                '}';
    }

    public OrganizationRecord(int index, String organizationId, String name, String website, String country, String description, int founded, String industry, int numberEmployees) {
        this.index = index;
        this.organizationId = organizationId;
        this.name = name;
        this.website = website;
        this.country = country;
        this.description = description;
        this.founded = founded;
        this.industry = industry;
        this.numberEmployees = numberEmployees;
    }

    public String getNameYear() {
        return name + " " + founded;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFounded() {
        return founded;
    }

    public void setFounded(int founded) {
        this.founded = founded;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public int getNumberEmployees() {
        return numberEmployees;
    }

    public void setNumberEmployees(int numberEmployees) {
        this.numberEmployees = numberEmployees;
    }
}
