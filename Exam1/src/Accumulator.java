import java.util.Scanner;
public class Accumulator {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int num = 0;
	int selection = 0;
	System.out.println("Enter a number and I will add it to your previous number (0 to terminate): ");
	num = scn.nextInt();
	selection = num;
	while (selection != 0) {
	 System.out.println("Enter another number: ");
	 selection = scn.nextInt();
	 num += selection;
	}
	System.out.println("Your final number is: " + num);
	}
}
