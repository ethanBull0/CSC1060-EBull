import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	System.out.println("Enter your factorial number: ");
	int factVal = scn.nextInt();
		System.out.println(factorialUp(factVal));
		System.out.println(factorialDown(factVal));
	}

	public static int factorialUp(int n) {
		int permN = n;
		for (int i = 1; permN > 1; i++) {
		n = n * i;
		permN--;
		}
		return n;
	}
	public static int factorialDown(int n) {
		for (int i = n - 1; i > 1; i--) { //n - 1 is what the other function's i goes up to
		n = n * i;
		}
		return n;
	}
}
