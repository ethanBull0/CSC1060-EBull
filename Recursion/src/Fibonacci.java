import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter iterations of the fibonacci sequence");
		int iterations = scn.nextInt();
		System.out.println(fibonacci(iterations));
	}

	public static int fibonacci(int n) { // add
		if (n == 1) {
			return 0; // start the incrementation process
		} else {

			int prev1 = fibonacci(n - 1);
			int prev2 = fibonacci(n - 2);
			return prev1 + prev2;
		}
	}
}
