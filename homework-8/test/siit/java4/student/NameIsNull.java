package siit.java4.student;

import java.util.ArrayList;

import org.junit.Test;


public class NameIsNull {
	
	@Test (expected = ValidationException.class)	
	public  void FirstNameIsNull() throws ValidationException{
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		studentList.add(new Student("", "Brad2", 1943, "f", 188023));
		StudentRepo st = new StudentRepo(studentList);
		st.addStudent();
	}
	

	@Test (expected = ValidationException.class)	
	public  void LastNameIsNull() throws ValidationException{
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		studentList.add(new Student("Ion", "", 1943, "f", 188023));
		StudentRepo st = new StudentRepo(studentList);
		st.addStudent();
	}
	
	@Test //expects to have First Name and Last Name set correctly; test asserts if no exception is thrown
	public  void NameIsCorrectlySet() throws ValidationException{
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		studentList.add(new Student("Ion", "Brad", 1943, "f", 188023));
		StudentRepo st = new StudentRepo(studentList);
		st.addStudent();
	}
	
}
