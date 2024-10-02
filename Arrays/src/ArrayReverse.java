import java.util.Scanner;
public class ArrayReverse {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the size of your array: ");
		int arrLen = scn.nextInt();
		int[] array = new int[arrLen];
		System.out.println("Enter an array of integers and I will reverse them (-1 to terminate.)");
		for (int i = 0; i < arrLen; i++) { //take integer input
			array[i] = scn.nextInt();
		}
		int arrReverse[] = new int[arrLen];
		System.out.println("Your array in reverse is: ");
		for (int i = 0; i < arrLen; i++) {
			arrReverse[i] = array[arrLen - 1 - i];
			System.out.print(arrReverse[i] + " ");
		}
		
	}

}
