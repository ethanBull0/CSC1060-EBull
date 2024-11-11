
public class Animal {

	private String name;
	private double weight;
	private double height;
	
	public Animal(String name, double weight, double height) {
		super();
		this.name = name;
		this.weight = weight;
		this.height = height;
	}


	public Animal() {
		super();
		name = "Animal";
		height = 1.0;
		weight = 1.0;
	}

	public String makeSound() {
		return "blah blah";
	}
	
	@Override
	public String toString() {
		return "Animal [name=" + name + ", weight=" + weight + ", height=" + height + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
