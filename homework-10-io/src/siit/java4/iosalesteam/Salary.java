package siit.java4.iosalesteam;

public enum Salary {
	//sales_manager, senior_sales_officer, sales_officer;

	SALES_MANAGER(40 , 30, 15 ),
	SENIOR_SALES_OFFICER(20 , 50, 25 ),
	SALES_OFFICER(10 , 25, 10 );

	public int getSalary() {
		return salary;
	}

	public int getPrePaid() {
		return prePaid;
	}

	public int getPostPaid() {
		return postPaid;
	}

	private final int salary;
	private final int prePaid;
	private final int postPaid;
	
	Salary( int salary, int prePaid, int postPaid) {
		this.salary=salary;
		this.prePaid = prePaid;
		this.postPaid = postPaid;
		
	}
}
