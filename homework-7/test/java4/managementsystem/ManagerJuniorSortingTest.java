package java4.managementsystem;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Test;

public class ManagerJuniorSortingTest{

	
	
	@Test
	public void ManagersAndJuniosAreCorrectlySorted() throws 	IllegalArgumentException{
		 ArrayList<Employee> employeeList=new ArrayList<Employee>();

	        employeeList.add(new Employee(true,"Brad",23,"junior"));
	        employeeList.add(new Employee(false,"Jack",24,"junior"));
	        employeeList.add(new Employee(true,"Steven",1,"manager"));
	        employeeList.add(new Employee(false,"Daniel",14,"manager"));
	        employeeList.add(new Employee(false,"Andrew",17,"junior"));
	        employeeList.add(new Employee(true,"Bobby",40,"manager"));
	        
	       
	       
	    
	        
	        Managers mn = new Managers(employeeList);
	        ArrayList<Employee> m=mn.sortingManagers();
	        ArrayList<Employee> j=mn.sortingJuniors();
	        int actual =m.size(); // verifies if the length of managers list and juniors list total matches full employee list length
	        int expected =employeeList.size() - j.size();
	      	assertEquals(expected, actual);
	        
	       // System.out.println("manager list size " + m.size() );
	       // System.out.println("junior list size " + j.size());
		
	}
		
}