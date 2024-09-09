import java.util.Scanner;
public class excersise1 {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int input;
	input = scn.nextInt();
	isPositive(input);
	}

	public static boolean isPositive(int num) {
		if (num >= 0) {
			return true;
		}
	return false;
	}
}
