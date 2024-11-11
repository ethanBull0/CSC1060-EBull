
public class Cat extends Animal {
	private String color;

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cat(String name, double weight, double height, String color) {
		super(name, weight, height);
		setColor(color);
		// TODO Auto-generated constructor stub
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String makeSound() {
		return "meow";
	}
	
	@Override
	public String toString() {
		return "Cat [getColor()=" + getColor() + ", getName()=" + getName() + ", getWeight()=" + getWeight()
				+ ", getHeight()=" + getHeight() + "]";
	}



	//new toString() to account for new property. Be careful to not do a toString for animal's toSTring

	

}
