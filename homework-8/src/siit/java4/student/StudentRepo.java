package siit.java4.student;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class StudentRepo {
	ArrayList<Student> studentList;
	ArrayList<Student> addedList = new ArrayList<Student>();
	ArrayList<Student> ageList = new ArrayList<Student>();
	int i;
	public long id;
	public int date;

	public StudentRepo(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

	public ArrayList<Student> addStudent() throws ValidationException {

		switch (studentList.get(i).getGender()) {
		case "m":
			break;
		case "M":
			break;
		case "F":
			break;
		case "f":
			break;
		default:
			throw new ValidationException("Invalid Gender Format: Gender should be M / F or m/f.");
		}
		if (studentList.get(i).getFirstName() == "" || studentList.get(i).getLastName() == "") {
			throw new ValidationException("First name and Last name fields should not be empty.");
		}
		if (studentList.get(i).getDate() < 1900 || studentList.get(i).getDate() > 1998) {
			throw new ValidationException("Date should be between 1900 and 1998.");
		}

		addedList.add(i, studentList.get(i));
		i++;

		System.out.println("here is the student list: " + addedList);

		return addedList;
	}

	public ArrayList<Student> deleteStudent(long ids) throws ValidationException { // delete student from list by ID
		this.id = ids;
		int verify = i;
		for (Student s : addedList) {
			if (id == s.getId()) {
				addedList.remove(addedList.indexOf(s));
				i--;
				System.out.println("Deleting student with id " + s.getId());
				System.out.println("Remaining list" + addedList);
				break;
			}
		}

		if (verify == i)
			throw new ValidationException("Specified ID not found. ");
		return addedList; // returns deleted list

	}

	public ArrayList<Student> getStudentByAge(int age) throws ValidationException { //age must be between 18 and 116 years
		this.date = age;
		int verify = addedList.size(); 
		
		if (age<18 || age>116) throw new ValidationException ("Specified age is out of range");
		for (Student s : addedList) {
			if (age == 2016 - s.getDate()) {
				verify--;
				ageList.add(s);
				System.out.println("Deleting student with id " + s.getId());
				System.out.println("Remaining list" + addedList);

			}
		if (verify==addedList.size()) throw new ValidationException ("No students found with the specified. ");

		}
		System.out.println("Students with age " + age + " are: ");
		System.out.println(ageList);
		return ageList;
	}
}