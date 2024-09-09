import java.util.Scanner;
public class BeerBottles {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num;
		System.out.println("Enter the bottles of beer you would like to start with: ");
		num = scn.nextInt();
		int startingNum = num;
		while (num > 0) {
			if (num == 1) {
				System.out.println(num + " bottle of beer on the wall, " + num + " bottle of beer");
				num--;
				System.out.println("Take one down and pass it around, " + num + " bottles of beer on the wall");
				continue;
			}
			System.out.println(num + " bottles of beer on the wall, " + num + " bottles of beer");
			num--;
			System.out.println("Take one down and pass it around, " + num + " bottles of beer on the wall");
		}
		System.out.println("Go to the store and buy some more, " + startingNum + " bottles of beer on the wall");
	}

}
