
public class User {

	private int id; //Admin, Company, Person all reside in the same list of ids.
	private String name;
	private String password;
	private String address;
	
	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}
	 /*public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} */
	//We don't want to change the name of Admin!
	/*public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	} */
	//let's make it so that only Admin can set user passwords.

}
