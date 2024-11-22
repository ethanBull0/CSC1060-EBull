
public class Student extends Person {

	private int status;
	/*
	 1 = freshman
	 2 = sophomore
	 3 = junior
	 4 = senior
	 */
	public Student() {
		
	}
	
	public Student(int status) {
		super();
		this.status = status;
	}


	public Student(String name, String address, String phoneNum, String email, int status) {
		super(name, address, phoneNum, email);
		this.status = status;
	}

	@Override
	public String toString() {
		return "Student [status=" + status + ", name=" + getName() + ", address=" + getAddress()
				+ ", phone number=" + getPhoneNum() + ", email=" + getEmail() + "]";
	}


	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}

}
