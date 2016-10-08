package siit.java4.student;

import java.util.ArrayList;

import org.junit.Test;

public class IdValidtyTest {

	@Test (expected = ValidationException.class)	
	public  void SpecifiedIdDoesNotExist() throws ValidationException{
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		studentList.add(new Student("Ion", "Brad2", 1943, "M", 188023));
		StudentRepo st = new StudentRepo(studentList);
		st.addStudent();
		st.deleteStudent(123);
	}
	
	@Test //no exception thrown if ID exist in list/ test asserts
	public  void IdExist() throws ValidationException{
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		studentList.add(new Student("Ion", "Brad2", 1943, "M", 1357));
		StudentRepo st = new StudentRepo(studentList);
		st.addStudent();
		st.deleteStudent(1357);
	}
	
}
