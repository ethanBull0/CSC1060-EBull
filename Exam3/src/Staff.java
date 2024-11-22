
public class Staff extends Employee {

	private String title;
	
	public Staff(String name, String address, String phoneNum, String email, String office, int salary, String dateHired, String title) {
		super(name, address, phoneNum, email, office, salary, dateHired);
		// TODO Auto-generated constructor stub
		this.title = title;
	}

	@Override
	public String toString() {
		return "Staff [title=" + title + ", office=" + getOffice() + ", salary=" + getSalary()
				+ ", date hired=" + getDateHired() + ", name=" + getName() + ", address=" + getAddress()
				+ ", phone number=" + getPhoneNum() + ", email=" + getEmail() + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Staff() {
		// TODO Auto-generated constructor stub
	}

}
