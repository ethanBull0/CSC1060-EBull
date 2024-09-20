import java.util.Scanner;
public class SumIntFor {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter a number and I will print the sum of all integers up to the number.");
	int num = scn.nextInt();
	System.out.println(sumNums(num));
	}
	public static int sumNums(int num) {
		int sum = 0;
		int i = 0;
		for (i = 0; i <= num; i++) {
			if (i >= num) {
				sum += i;
				System.out.print(i + " = ");
				return sum;
			}
			sum += i;
		System.out.print(i + " + ");
		}
		return sum;
	}
}
