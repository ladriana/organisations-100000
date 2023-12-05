package ro.scoalainformala.comparators;

import ro.scoalainformala.OrganizationRecord;

import java.util.Comparator;

public class CompanyComparatorByYearFounded implements Comparator<OrganizationRecord> {

    @Override
    public int compare (OrganizationRecord s1, OrganizationRecord s2) {
        return s1.getFounded()-s2.getFounded();
    }
}
