import java.util.Scanner;
public class interactiveGreet {

	public static void main(String[] args) {
		String name;
		String location;
		String garbage;
		int age;
		String hobby;
		int donation;
		Scanner scn = new Scanner(System.in);		
	System.out.println("What is your name? ");
	name = scn.nextLine();
	System.out.println("What is your location? ");
	location = scn.nextLine();
	System.out.println("What is your age? ");
	age = scn.nextInt();
	garbage = scn.nextLine();
	System.out.println("Hello " + name + " from " + location + ". ");
	System.out.print("You are " + age + " years old.");
	System.out.println("What is something you like to do? ");
	hobby = scn.nextLine();
	System.out.println("Have fun next time you " + hobby + "!");
	System.out.println("How much would you like to donate today? ");
	donation = scn.nextInt();
	System.out.println("You will donate $" + donation + " dollars today. Yay!");
	}

}
