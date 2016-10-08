package siit.java4.student;


public class Student {
	String firstName, lastName;
	int date;
	String gender;
	long id;
	
	
	public Student (String firstName, String lastName, int date, String gender, long id){
		this.firstName=firstName;
		this.lastName=lastName;
		this.date=date;
		this.gender=gender;
		this.id=id;
		
	}


	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public Integer getDate()  {
		return date;
	}


	public String getGender() {
		return gender;
	}


	public Long getId() {
		return id;
	}


	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastname=" + lastName + ", date=" + date + ", gender=" + gender
				+ ", id=" + id + "]";
	}

}