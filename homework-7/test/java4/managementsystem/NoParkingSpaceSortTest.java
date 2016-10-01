package java4.managementsystem;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.TreeSet;

import org.junit.Test;

public class NoParkingSpaceSortTest {


	@Test
	public void ParkingListCorrectlySet() throws 	IllegalArgumentException{
		 ArrayList<Employee> employeeList=new ArrayList<Employee>();
		 ArrayList<Employee> mockedEmployeeList=new ArrayList<Employee>();
				 
				 
	        employeeList.add(new Employee(true,"Brad",23,"junior"));
	        employeeList.add(new Employee(false,"Jack",24,"junior"));
	        employeeList.add(new Employee(true,"Steven",1,"manager"));
	        employeeList.add(new Employee(false,"Daniel",14,"manager"));
	        employeeList.add(new Employee(false,"Andrew",17,"junior"));
	        employeeList.add(new Employee(true,"Bobby",40,"manager"));
	        
	    
	        mockedEmployeeList.add(new Employee(false,"Daniel",14,"manager")); // mockedlist of employees without parking space to verify with
	        mockedEmployeeList.add(new Employee(false,"Andrew",17,"junior"));
	        mockedEmployeeList.add(new Employee(false,"Jack",24,"junior"));
	        
	       
	        ParkingSeparator  ps = new ParkingSeparator(employeeList);
	        TreeSet<Employee> p = ps.separator();
	        System.out.println(p);
	        System.out.println(mockedEmployeeList);
	        
	       
	        boolean actual = p.containsAll(mockedEmployeeList); 
	        boolean expected = true;
	      	assertEquals(expected, actual);
	}
}

