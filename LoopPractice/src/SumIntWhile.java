import java.util.Scanner;
public class SumIntWhile {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int num = scn.nextInt();
	System.out.println(sumUpToNum(num));
	}

	public static int sumUpToNum(int num) {
		int sum = 0;
		int i = 0;
		while (i <= num) {
		if (i >= num) {
			sum += i;
			System.out.print(i + " = ");
			return sum;
			}
		sum += i;
		i++;
		}
	return sum;
	}
}
