package java4.managementsystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
//import java.util.Set;

public class Main {

	/**
     * @param args
     */
    public static void main(String[] args) {

        ArrayList<Employee> employeeList=new ArrayList<Employee>();

        employeeList.add(new Employee(true,"Brad",23,"junior"));
        employeeList.add(new Employee(false,"Jack",24,"manager"));
        employeeList.add(new Employee(true,"Steven",1,"junior"));
        employeeList.add(new Employee(false,"Daniel",14,"manager"));
        employeeList.add(new Employee(false,"Andrew",17,"junior"));
        employeeList.add(new Employee(true,"Bobby",40,"manager"));
        
        Iterator<Employee> itr1=employeeList.iterator(); // lists the initial list of employees
        System.out.println("Printing full employee list");
        while(itr1.hasNext()) {
            System.out.println(itr1.next());        
        }
       
        ParkingSeparator  ps = new ParkingSeparator(employeeList);
        ps.separator();
        
        Managers mn = new Managers(employeeList);
        System.out.println("managers list: ");
        System.out.println(mn.sortingManagers());
        System.out.println("juniors list: ");
        System.out.println(mn.sortingJuniors());
       
    }
}    