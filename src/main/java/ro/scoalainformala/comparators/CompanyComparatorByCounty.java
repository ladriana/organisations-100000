package ro.scoalainformala.comparators;

import ro.scoalainformala.OrganizationRecord;

import java.util.Comparator;

public class CompanyComparatorByCounty implements Comparator<OrganizationRecord> {
    @Override
    public int compare(OrganizationRecord s1, OrganizationRecord s2) {
        return s1.getCountry().compareTo(s2.getCountry());
    }
}
