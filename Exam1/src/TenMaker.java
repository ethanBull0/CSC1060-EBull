import java.util.Scanner;
public class TenMaker {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter two integers and I will determine if their sum is 10.");
	System.out.println("Integer 1: ");
	int num1 = scn.nextInt();
	System.out.println("Integer 2: ");
	int num2 = scn.nextInt();
	System.out.println(makes10(num1, num2));
	}
	public static boolean makes10(int a, int b) {
		if (a + b == 10) {
			return true;
		}
		return false;
	}
}
