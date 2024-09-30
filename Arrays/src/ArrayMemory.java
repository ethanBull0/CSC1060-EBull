import java.util.Scanner;

public class ArrayMemory {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int digit = -1;
		System.out.println("How many numbers would you like to input? ");
		int arrLen = scn.nextInt();
		int[] nums = new int[arrLen];
		System.out.println("Enter your numbers: ");
		for (int i = 0; i < arrLen ; i++) {
			digit = scn.nextInt();
			nums[i] = digit;
		}
		System.out.println("Here are your values: ");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

}
