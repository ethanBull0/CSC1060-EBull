
public class Person {

	private String firstName;
	private String lastName;
	private double height;
	private int weight;

	public Person() {
		firstName = "Ethan";
		lastName = "Bull";
		height = 5.9;
		weight = 160;
	}
	
	public Person(int weight, int height) {
		this.weight = weight;
		this.height = height;
	}
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Person(double height, int weight) {
		this.height = height;
		this.weight = weight;
	}
}
