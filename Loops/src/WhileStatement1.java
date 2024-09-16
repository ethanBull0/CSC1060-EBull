import java.util.Scanner;
public class WhileStatement1 {

	public static void main(String[] args) {
		String name = "";
		int age = -1;
		Scanner scn = new Scanner(System.in);
		while (age < 0) {
		System.out.println("Enter your age: ");
		age = scn.nextInt();
		}
		scn.nextLine();
		System.out.println("Enter your name: ");
		name = scn.nextLine();
		System.out.println("Your age is " + age + " and your name is " + name + ".");
	}

}
