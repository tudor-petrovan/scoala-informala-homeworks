package siit.java4.iosalesteam;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CalculateSalary {

	@SuppressWarnings({ "resource" })
	public void calculateSalary() throws IOException {

		File empFile = new File("files/sales_team");
		SalesTeamReader empReader = new SalesTeamReader(new FileReader(empFile));
		for(Employee employee: empReader.readTeam()){
			if(employee.getJobPosition()==Salary.SALES_OFFICER){	
				Salary salar =  Salary.SALES_OFFICER;
				System.out.println(employee.getName() + " - " +((employee.getWorkedHours()-8*employee.getDaysOff())*salar.getSalary()
						+ salar.getPostPaid()*employee.getPostPaidSales() 
							+ salar.getPrePaid()*employee.getPrePaidSales()));		
			}
		
			if(employee.getJobPosition()==Salary.SENIOR_SALES_OFFICER){	
				Salary salar =  Salary.SENIOR_SALES_OFFICER;
				System.out.println(employee.getName() + " - " +((employee.getWorkedHours()-8*employee.getDaysOff())*salar.getSalary()
						+ salar.getPostPaid()*employee.getPostPaidSales() 
							+ salar.getPrePaid()*employee.getPrePaidSales()));		
			}
			
			if(employee.getJobPosition()==Salary.SALES_MANAGER){	
				Salary salar =  Salary.SALES_MANAGER;
				Salary officerBonus = Salary.SALES_OFFICER;
				Salary seniorBonus = Salary.SENIOR_SALES_OFFICER;
				System.out.println(employee.getName() + " - "
						+(((employee.getWorkedHours()-8*employee.getDaysOff())*salar.getSalary())
							+ (officerBonus.getPostPaid() + seniorBonus.getPostPaid())*30 
								+ (officerBonus.getPrePaid() + seniorBonus.getPrePaid())*15));		
			}
						
		}	
		
	
	}
	
}
