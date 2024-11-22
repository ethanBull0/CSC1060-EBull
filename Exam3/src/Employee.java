
public class Employee extends Person {

	private String office;
	private int salary;
	private String dateHired;
	
	@Override
	public String toString() {
		return "Employee [office=" + office + ", salary=" + salary + ", dateHired=" + dateHired + ", name="
				+ getName() + ", address=" + getAddress() + ", phone number=" + getPhoneNum() + ", email="
				+ getEmail() + "]";
	}

	public Employee(String name, String address, String phoneNum, String email, String office, int salary, String dateHired) {
		super(name, address, phoneNum, email);
		// TODO Auto-generated constructor stub
		this.office = office;
		this.salary = salary;
		this.dateHired = dateHired;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDateHired() {
		return dateHired;
	}

	public void setDateHired(String dateHired) {
		this.dateHired = dateHired;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

}
