
public class Car {

	// data members
	private String color;
	private int mileage;
	private double amountOfGas;
	private boolean isClean;

	// constructor
	public Car() { // this will return something of the type 'car' equivalent to public Car Car()
					// {}
		color = "Green";
		mileage = 4;
		amountOfGas = 2.0;
		isClean = false;
	}

	public Car(String color, int mileage) {
		this.color = color;
		this.mileage = mileage;
	}

	// getters and setters(aka accessors and mutators)
	public String getColor() {
		return color;
	}

	public int getMileage() {
		return mileage;
	}
	
	public boolean getIsClean() {
		return isClean;
	}

	public double getAmountOfGas() {
		return amountOfGas;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setMileage(int miles) {
		mileage = miles;
	}

	public String toString() {
		String str = "Color: " + color + " Mileage: " + mileage + " Gas: " + amountOfGas + " Is clean: " + isClean;
		return str;
	}
	
	public void selfClean() {
		isClean = true;
	}

	public void drive(int numMiles) { // state miles, decrease mileage, decrease amount of gas
		for (int i = 0; i <= numMiles; i++) {
			if (amountOfGas >= 0) {
				System.out.println(i + " miles in");
				amountOfGas = amountOfGas - 0.1;
				mileage++;
			}
		}
	}
}
