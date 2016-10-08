package siit.java4.student;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
	private static Logger LOGGER = Logger.getLogger("ro.sci.logging.Logging");

	public static void main(String[] args){
		LOGGER.fine("In main");
		LOGGER.info("start main");
		
		try{
			
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		LOGGER.fine("before adding  students");
		studentList.add(new Student("Ion1", "Brad", 1996, "M", 18801));
		studentList.add(new Student("Ion2", "Brad2", 1943, "f", 188023));
		studentList.add(new Student("Ion3", "Brad3", 1996, "m", 12345));
		studentList.add(new Student("Ion4", "Brad4", 1996, "M", 54378));
		LOGGER.fine("after adding students");

		// Iterator<Student> itr1=studentList.iterator(); // lists the initial
		// list of students
		// System.out.println("Printing student list");
		// while(itr1.hasNext()) {
		// System.out.println(itr1.next());

		// }
		LOGGER.fine("before creating a repository");
		StudentRepo st = new StudentRepo(studentList);
		st.addStudent();
		st.addStudent();
		st.addStudent();
		st.addStudent();
		st.deleteStudent(12345);
		st.getStudentByAge(20);
		LOGGER.fine("after creating a repository");

		} catch (ValidationException e){
			//e.printStackTrace();
			LOGGER.log(Level.SEVERE, "Error during run", e);
		}
		LOGGER.info("end main");

	}
}
