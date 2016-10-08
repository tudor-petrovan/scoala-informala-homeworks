package siit.java4.student;

import java.util.ArrayList;

import org.junit.Test;

public class GenderTest {

	@Test 	//test asserts if no exception is thrown. Adding upercase F / M and lowercase f / m
	public  void CaseTest() throws ValidationException{
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		studentList.add(new Student("Ion", "Brad2", 1943, "F", 188023));
		studentList.add(new Student("Ion", "Brad2", 1943, "M", 188023));
		studentList.add(new Student("Ion", "Brad2", 1943, "f", 188023));
		studentList.add(new Student("Ion", "Brad2", 1943, "m", 188023));
		StudentRepo st = new StudentRepo(studentList);
		st.addStudent();
		st.addStudent();
		st.addStudent();
		st.addStudent();
		
	}
	
	@Test 	(expected = ValidationException.class)
	public  void InvalidGenderFormat() throws ValidationException{
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		studentList.add(new Student("Ion", "Brad2", 1943, "x", 188023));
		StudentRepo st = new StudentRepo(studentList);
		st.addStudent();
	}
	
}
