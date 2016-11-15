package siit.java4.iosalesteam;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class FileReadTest {
	
	@Test
	public void fileReadTestOk() throws IOException {

		File empFile = new File("files/sales_team");
		SalesTeamReader empReader = new SalesTeamReader(new FileReader(empFile));
		boolean actual = true;
		for(Employee employee: empReader.readTeam()){
			switch (employee.getName()){
				case "George Washington" :break;
				case "Michael Douglas" :break;
				case "Jennifer Lawrence" :break;
				case "Kurt Douglas" :break;
				default:  actual=false;
			}			
		}
		boolean expected=true;
		assertEquals(expected, actual);
	}
	
	@Test
	public void fileReadTestNameNotOk() throws IOException {

		File empFile = new File("files/sales_team");
		SalesTeamReader empReader = new SalesTeamReader(new FileReader(empFile));
		boolean actual = true;
		for(Employee employee: empReader.readTeam()){
			switch (employee.getName()){
				case "Georgica Washington" :break;
				case "Michael Douglas" :break;
				case "Jennifer Lawrence" :break;
				case "Kurt Douglas" :break;
				default:  actual=false;
			}			
		}
		boolean expected=false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void fileReadNumberOfLinesOk() throws IOException {

		File empFile = new File("files/sales_team");
		SalesTeamReader empReader = new SalesTeamReader(new FileReader(empFile));
		int actual = 0;
		for(Employee employee: empReader.readTeam()){
			actual++;
			}			
		int expected=4;
		assertEquals(expected, actual);
	}
	
	
	
}
