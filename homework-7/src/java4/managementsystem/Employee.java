package java4.managementsystem;

public class Employee {

    boolean parkingSpace;
    String name;
    int ageInCompany;
    String role;

    public Employee(boolean parkingSpace,String name,Integer ageInCompany, String role) {
        this.parkingSpace=parkingSpace;
        this.name=name;
        this.ageInCompany=ageInCompany;
        this.role=role;
    }
 

    public Boolean isParkingSpace() {
		return parkingSpace;
	}


	public String getName() {
		return name;
	}

	

	public String getRole() {
		return role;
	}


	public Integer getAgeInCompany() {
		return ageInCompany;
	}

	

	public String toString(){
        String foo = "The employee named "+ this.name + " works in the company for " + this.ageInCompany + " years. Parking place status: " + parkingSpace + ". Role in company: " + this.role;
		return foo;

    }


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ageInCompany;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (parkingSpace ? 1231 : 1237);
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (ageInCompany != other.ageInCompany)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (parkingSpace != other.parkingSpace)
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		return true;
	}
}