import java.util.Scanner;
public class tempConversion2 {

	public static void main(String[] args) {
		double fahrTemp;
		Scanner scm = new Scanner(System.in);
		System.out.print("Enter your Fahrenheit temperature: ");
		fahrTemp = scm.nextDouble();
		scm.close();
		double fahrToCelsius = (fahrTemp - 32) * (5/9);
		double fahrToKelvin = ((fahrTemp - 32) * (5/9) + 273.15);
		System.out.println("Your fahrenheit temperature is: " + fahrTemp);
		System.out.println("Converted to Celsius: " + fahrToCelsius);
		System.out.println("Converted to Kelvin: " + fahrToKelvin);

	}

}
