import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number and I will return its factorial.");
		int num = scn.nextInt();
		System.out.println(factorial(num));
	}

	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			int prev = factorial(n - 1);
			return prev * n;
		}
	}
}
