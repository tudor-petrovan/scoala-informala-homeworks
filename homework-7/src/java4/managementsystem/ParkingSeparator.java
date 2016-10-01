package java4.managementsystem;

import java.util.ArrayList;
//import java.util.List;
import java.util.TreeSet;

public class ParkingSeparator {
	ArrayList<Employee> employeeList;
	TreeSet<Employee> parkingTrue = new TreeSet<Employee>(new EmployeeComparator());

	public ParkingSeparator(ArrayList<Employee> employeeList) {

		this.employeeList = employeeList;
	}

	public TreeSet<Employee> separator() {

		for (Employee e : employeeList) {
			if (e.isParkingSpace() == false) {
				parkingTrue.add(e);
			}

		}
		System.out.println("");
		System.out.println("Printing employees without parking space");
		for (Employee e : parkingTrue) {
			System.out.println(e);
		}
		return parkingTrue;

	}

}

