import java.util.Scanner;
public class cylinder {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double length;
		double radius;
		System.out.println("Enter length: ");
		length = scn.nextDouble();
		System.out.println("Enter radius: ");
		radius = scn.nextDouble();
		cylinder(length, radius);
	}
	public static void cylinder(double len, double rad) {
		double area = Math.pow(rad, 2)* Math.PI;
		double volume = area * len;
		System.out.println(area);
		System.out.println(volume);
	}
}
