
public class Horse extends Animal {
	private String breed;

	public Horse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String makeSound() {
		return "neigh";
	}
	
	@Override
	public String toString() {
		return "Horse [breed=" + breed + ", getName()=" + getName() + ", getWeight()=" + getWeight() + ", getHeight()="
				+ getHeight() + "]";
	}

	public Horse(String name, double weight, double height, String breed) { //change this if you add attributes
		super(name, weight, height);
		this.breed = breed;
	}

	

}
