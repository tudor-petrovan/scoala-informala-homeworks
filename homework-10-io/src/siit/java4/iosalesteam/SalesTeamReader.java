package siit.java4.iosalesteam;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

//import siit.java4.iosalesteam.Employee.EmployeeType;

public class SalesTeamReader extends BufferedReader {

	
	public SalesTeamReader(Reader reader) {
		super(reader);
	}
	
	public List<Employee> readTeam() throws IOException{
		String rLine = readLine();	
		ArrayList<Employee> employees = new ArrayList<>();
		while (rLine !=null){
			String[] tokens = rLine.split(Pattern.quote("|"));
			Employee employee = new Employee();
			employee.setName(tokens[0]);
			employee.setJobPosition(Salary.valueOf(tokens[1])); 
			employee.setWorkedHours(Integer.parseInt(tokens[2]));
			employee.setDaysOff(Integer.parseInt(tokens[3]));
			employee.setPrePaidSales(Integer.parseInt(tokens[4]));
			employee.setPostPaidSales(Integer.parseInt(tokens[5]));
			employees.add(employee);
			rLine = readLine();
			
				/*if(employee.getJobPosition()==Salary.SALES_OFFICER){
				
					Salary salar =  Salary.SALES_OFFICER;
					System.out.println(employee.getName() + " - " +((employee.getWorkedHours()-8*employee.getDaysOff())*salar.getSalary()
							+ salar.getPostPaid()*employee.getPostPaidSales() 
								+ salar.getPrePaid()*employee.getPrePaidSales()));
					
			}*/	
		}
		
		return employees;
		
	}
	
}
 	