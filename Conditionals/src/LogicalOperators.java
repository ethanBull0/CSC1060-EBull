import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int input;
		System.out.println("Enter an integer: ");
		input = scn.nextInt();
		if (input > 10) {
			System.out.println("Input is greater than 10.");
		}
		if (input >= 10 && input <= 20) {
			System.out.println("Input is between 10 and 20.");
		}
		if ((input > 30 && input < 50) || (input < -1 && input > -6)) {
			System.out.println("Input is greater than 30 and less than 50.");
		} else {
			System.out.println("Number has not been accounted for.");
		}
		input = scn.nextInt();
		isSingleDigit(input);
	}

	public static boolean isSingleDigit(int num) {
		if (num > -10 && num < 10) {
			return true;
		}
		return false;
	}
}
