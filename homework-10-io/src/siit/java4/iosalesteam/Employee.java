package siit.java4.iosalesteam;

public class Employee {

	private String name;
	private Salary jobPosition;
	private int workedHours;
	private int daysOff;
	private int prePaidSales;
	private int postPaidSales;

	/*public Employee(String name, String jobPosition, int workedHours, int daysOff, int prePaidSales,
			int postPaidSales) {
		super();
		this.name = name;
		this.jobPosition = jobPosition;
		this.workedHours = workedHours;
		this.daysOff = daysOff;
		this.prePaidSales = prePaidSales;
		this.postPaidSales = postPaidSales;
	}*/

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Salary getJobPosition() {
		return jobPosition;
	}

	public void setJobPosition(Salary jobPosition) {
		this.jobPosition = jobPosition;
	}

	public int getWorkedHours() {
		return workedHours;
	}

	public void setWorkedHours(int workedHours) {
		this.workedHours = workedHours;
	}

	public int getDaysOff() {
		return daysOff;
	}

	public void setDaysOff(int daysOff) {
		this.daysOff = daysOff;
	}

	public int getPrePaidSales() {
		return prePaidSales;
	}

	public void setPrePaidSales(int prePaidSales) {
		this.prePaidSales = prePaidSales;
	}

	public int getPostPaidSales() {
		return postPaidSales;
	}

	public void setPostPaidSales(int postPaidSales) {
		this.postPaidSales = postPaidSales;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", jobPosition=" + jobPosition + ", workedHours=" + workedHours + ", daysOff="
				+ daysOff + ", prePaidSales=" + prePaidSales + ", postPaidSales=" + postPaidSales + "]";
	}

}
