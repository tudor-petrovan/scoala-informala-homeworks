package siit.java4.student;

import java.util.ArrayList;

import org.junit.Test;

public class DateAgeTest {
	
	@Test (expected = ValidationException.class)	
	public  void AgeNotFound() throws ValidationException{
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		
		studentList.add(new Student("Ion1", "Brad", 1996, "M", 18801));
		studentList.add(new Student("Ion2", "Brad2", 1943, "f", 188023));
		studentList.add(new Student("Ion3", "Brad3", 1996, "m", 12345));
		studentList.add(new Student("Ion4", "Brad4", 1996, "M", 54378));
		
		StudentRepo st = new StudentRepo(studentList);
		st.addStudent();
		st.addStudent();
		st.addStudent();
		st.addStudent();
		st.getStudentByAge(213);
	}
	
	@Test (expected = ValidationException.class)	
	public  void AgeOutOfRange() throws ValidationException{
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		
		studentList.add(new Student("Ion1", "Brad", 1996, "M", 18801));
		studentList.add(new Student("Ion2", "Brad2", 1943, "f", 188023));
		studentList.add(new Student("Ion3", "Brad3", 1996, "m", 12345));
		studentList.add(new Student("Ion4", "Brad4", 1996, "M", 54378));
		
		StudentRepo st = new StudentRepo(studentList);
		st.addStudent();
		st.addStudent();
		st.addStudent();
		st.addStudent();
		st.getStudentByAge(123);
	}

}
