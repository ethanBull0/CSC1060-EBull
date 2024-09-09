import java.util.Scanner;
public class BeerBottles {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num;
		System.out.println("Enter the bottles of beer you would like to start with: ");
		num = scn.nextInt();
		int startingNum = num;
		while (num < 100) {
			if (num == 1) {
				System.out.println(num + " bottle of beer");
			}
			System.out.println(num + " bottles of beer");
			num++;
		}
		if (startingNum == 1) {
			System.out.println(startingNum + " bottle of beer");
		}
	System.out.println(startingNum + " bottles of beer");
	}

}
