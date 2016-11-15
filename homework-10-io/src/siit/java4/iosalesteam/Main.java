package siit.java4.iosalesteam;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;



public class Main {

	@SuppressWarnings("null")
	public static void main(String[] args) throws IOException {
	/*	File empFile = new File("files/sales_team");
		SalesTeamReader empReader = new SalesTeamReader(new FileReader(empFile));
		for(Employee employee: empReader.readTeam()){
			System.out.println(employee);
		}
		
		Salary job = null;
		for(Employee employee: empReader.readTeam()){
			if (employee.getJobPosition()==Salary.SALES_MANAGER){
				System.out.println("aici2" +job.getPrePaid());}
				else { System.out.println("partea 2");}
			
				
			}*/
		
		//System.out.println(job.getPrePaid()+3);

		CalculateSalary calc = new CalculateSalary();
		calc.calculateSalary();
		
		//empReader.close();
	
}}
