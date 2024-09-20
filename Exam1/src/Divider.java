import java.util.Scanner;
public class Divider {

	public static void main(String[] args) {
	int input1 = 0;
	int input2 = 0;
	Scanner scn = new Scanner(System.in);
	System.out.println("I will divide two numbers for you.");
	System.out.print("Numerator: ");
	input1 = scn.nextInt();
	while (input2 == 0) {
	System.out.print("Denominator: ");
	input2 = scn.nextInt();
	}
	System.out.println("Your result is: " + divide(input1, input2));
	}

	public static double divide(int num1, int num2) {
		double num1Double = num1;
		double num2Double = num2;
		double dividedNum = num1Double / num2Double;
		return dividedNum;
	}
}
