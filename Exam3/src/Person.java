
public class Person {

	private String name;
	private String address;
	private String phoneNum;
	private String email;
	
	public Person() {
		
	}

	public Person(String name, String address, String phoneNum, String email) {
		super();
		this.name = name;
		this.address = address;
		this.phoneNum = phoneNum;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", phone number=" + phoneNum + ", email=" + email + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
