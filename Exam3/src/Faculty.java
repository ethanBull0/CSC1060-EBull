
public class Faculty extends Employee {

	private String officeHours;
	private boolean isSenior;
	/*
	 0 = junior
	 1 = senior
	 */
	
	@Override
	public String toString() {
		return "Faculty [officeHours=" + officeHours + ", isSenior=" + isSenior + ", office=" + getOffice()
				+ ", salary=" + getSalary() + ", date hired=" + getDateHired() + ", name=" + getName()
				+ ", address=" + getAddress() + ", phone number=" + getPhoneNum() + ", email=" + getEmail()
				+ "]";
	}

	public String getOfficeHours() {
		return officeHours;
	}

	public Faculty(String name, String address, String phoneNum, String email, String office, int salary,
			String dateHired, String officeHours, boolean isSenior) {
		super(name, address, phoneNum, email, office, salary, dateHired);
		// TODO Auto-generated constructor stub
		this.officeHours = officeHours;
		this.isSenior = isSenior;
	}

	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	public boolean isSenior() {
		return isSenior;
	}

	public void setSenior(boolean isSenior) {
		this.isSenior = isSenior;
	}

	
	public Faculty() {
	}

}
