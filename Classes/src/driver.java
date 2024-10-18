import java.util.Scanner;

public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Person guy = new Person();
		System.out.println("Enter this guy's weight: ");
		int weight = scn.nextInt();
		guy.setWeight(weight);
		System.out.println("Enter this guy's height: ");
		int height = scn.nextInt();
		guy.setHeight(height);
			System.out.println(guy.getHeight() + " " + guy.getWeight());
		
		Car myCar = new Car();
		System.out.println("Color: " + myCar.getColor());
		
		myCar.setColor("Pink");
		System.out.println("Color: " + myCar.getColor());
		
		System.out.println(myCar.toString());
		
		myCar.selfClean();
		
		myCar.drive(50);
		System.out.println(myCar.getMileage() + " miles");
		System.out.println(myCar.getAmountOfGas() + " gallons");
	}
