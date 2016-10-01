package java4.managementsystem;

import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.Iterator;
//import java.util.List;

public class Managers {
	ArrayList<Employee> employeeList;
	ArrayList<Employee> managers = new ArrayList<Employee>();
	ArrayList<Employee> juniors = new ArrayList<Employee>();


	public Managers(ArrayList<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	
	public ArrayList<Employee> sortingManagers(){
		for(Employee e:employeeList){
			switch(e.getRole()){
			case "manager":  managers.add(e);break;
			case "junior": break;
			default: throw new IllegalArgumentException("this role doesn't exist");
			}		
		}
		return managers;
	}
	
	public ArrayList<Employee> sortingJuniors(){
		for(Employee e:employeeList){
			switch(e.getRole()){
			case "manager": ;break;
			case "junior": juniors.add(e);break;
			default: throw new IllegalArgumentException("this role doesn't exist");
			}	
		}
		return juniors;
	 
	}
}

