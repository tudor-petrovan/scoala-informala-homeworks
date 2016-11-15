package siit.java4.iosalesteam;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class CalculateSalaryTest {

	@Test
	public void calculateSalaryTest() throws IOException {
		int actual=3;
		File empFile = new File("files/sales_team");
		SalesTeamReader empReader = new SalesTeamReader(new FileReader(empFile));
		for (Employee employee : empReader.readTeam()) {
			if (employee.getName().equals("Jennifer Lawrence") ) {
						Salary salar = Salary.SALES_OFFICER;
							actual = ((employee.getWorkedHours() - 8 * employee.getDaysOff()) * salar.getSalary()
									+ salar.getPostPaid() * employee.getPostPaidSales()
										+ salar.getPrePaid() * employee.getPrePaidSales());
				}
			}
		
		int expected = 290;
		System.out.println(expected + " " + actual);
		assertEquals(expected,actual);
	}
}