
public class Dog extends Animal {

	public Dog(String name, double weight, double height) {
		super();
		setName(name);
		setWeight(weight);
		setHeight(height);
	}
	
	@Override
	public String makeSound() {
		return "Bow wow";
	}

}
