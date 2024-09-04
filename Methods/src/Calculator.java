import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
	Scanner numget = new Scanner(System.in);
	double num1, num2;
	String empty;
	System.out.print("Enter numerator: ");
	num1 = numget.nextInt();
	System.out.print("Enter denominator: ");
	num2 = numget.nextInt();
	System.out.println(add(num1, num2));
	System.out.println(sub(num1, num2));
	System.out.println(mul(num1, num2));
	System.out.println(div(num1, num2));
	}
	public static double add(double a, double b) {
	double result = a + b;
	return result;
	}
	
	public static double sub(double a, double b) {
	double result = a - b;
	return result;
	}
	
	public static double mul(double a, double b) {
	double result = a * b;
	return result;
	}
	
	public static double div(double a, double b) {
	double result = a / b;
	return result;
	}
	
}
