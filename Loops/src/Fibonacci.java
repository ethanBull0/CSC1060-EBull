import java.util.Scanner;
public class Fibonacci {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = 0;
		System.out.println("Enter desired iterations of Fibonacci sequence: ");
		n = scn.nextInt();
		ForFibonacci(n);
		WhileFibonacci(n);
	}

	public static int ForFibonacci(int count) {
		int fib1 = 0;
		int fib2 = 1;
		int fibT;
		for (int i = 1; i < count; i++) {
		fibT = fib2;
		fib2 += fib1;
		fib1 = fibT;
		}
		return fib2;
	}
	public static int WhileFibonacci(int count) {
		int fib1 = 0;
		int fib2 = 1;
		int fibT;
		int i = 1;
		while (i < count) {
		fibT = fib2;
		fib2 += fib1;
		fib1 = fibT;
		i++;
		}
		return fib2;
	}
}
