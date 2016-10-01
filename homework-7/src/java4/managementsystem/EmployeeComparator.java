package java4.managementsystem;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {


    public int compare(Employee object1, Employee object2) {

        return object1.getAgeInCompany().compareTo(object2.getAgeInCompany());
    }
    
    
}