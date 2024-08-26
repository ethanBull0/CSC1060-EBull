
public class tempConversion {
	public static void main(String[] args) {
double tempFahrenheit = 62.0;
double tempCelsius = 30.0;
double tempKelvin = 303.0;
double fahrConversionFromCelsius = tempCelsius + 32;
double kelvinConversionFromCelsius = tempCelsius + 273.15;
double celsiusConversionFromFahr = (tempFahrenheit - 32) * (5/9);
double kelvinConversionFromFahr = ((tempFahrenheit - 32) * (5/9) + 273.15);
double fahrConversionFromKelvin  = (((tempKelvin - 273.15) / (5/9)) + 32);
double celsiusConversionFromKelvin = tempKelvin - 273.15;
	System.out.println("          From Celsius | From Fahrenheit | From Kelvin");
	System.out.println("          ------------  ----------------  -------------");
	System.out.println("Kelvin    |");
	System.out.println("          |");
	System.out.println("Celsius   |");
	System.out.println("          |");
	System.out.println("Fahrenheit|");
	}
}