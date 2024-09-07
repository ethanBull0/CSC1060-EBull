import java.util.Scanner;
public class CircleCalc {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double radius;
		System.out.println("Enter the radius of your circle: ");
		radius = scn.nextDouble();
		double diameter = radius * 2;
		double area = Math.pow(radius, 2);
		double circumference = 2 * Math.PI * radius;
		System.out.println("Diameter = " + diameter);
		System.out.println("Area = " + area);
		System.out.println("Circumference = " + circumference);
	}
}
