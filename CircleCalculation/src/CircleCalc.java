import java.util.Scanner;
public class CircleCalc {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double radius;
		System.out.println("Enter the radius of your circle: ");
		radius = scn.nextDouble();
		System.out.println("Diameter = " + diameter(radius));
		System.out.println("Area = " + area(radius));
		System.out.println("Circumference = " + circumference(radius));
	}
	public static double diameter(double a) {
		return a * 2;
	}
	public static double area(double a) {
		return Math.PI * Math.pow(a, 2);
	}
	public static double circumference(double a) {
		return 2 * Math.PI * a;
	}
}
