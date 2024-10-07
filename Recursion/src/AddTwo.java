import java.util.Scanner;

public class AddTwo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number. I will the Nth term of two.");
		int num = scn.nextInt();
		System.out.println(findNthTerm(num));
	}

	public static int findNthTerm(int n) {
		if (n == 0) {
			return 0;
		} else {
			int prev = findNthTerm(n - 1);
			return prev + 2;
		}
	}
}
