import java.util.Scanner;
public class Scanning {
	public static void main(String[] args) {
		String line;
		int age;
		double temp;
		Scanner scm = new Scanner(System.in);
		line = scm.nextLine();
		System.out.println("you typed: " + line);
		System.out.print("Enter your age: ");
		age = scm.nextInt();
		System.out.println("You are " + age + " years old.");
		System.out.print("Enter the temperature: ");
		temp = scm.nextDouble();
		System.out.println("The temperature today is " + temp);
	}
}
