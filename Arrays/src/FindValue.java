import java.util.Scanner;

public abstract class FindValue {

	public static void main(String[] args) {
		System.out.println("I will determine if a string cotains a specific integer.");
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter array length: ");
		int arrLen = scn.nextInt();
		int[] arr = new int[arrLen];
		System.out.println("Enter your array: ");
		for (int i = 0; i < arrLen; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println("Enter an integer: ");
		int value = scn.nextInt();
		System.out.println("Returned " + strContains(arr, value));
	}

	public static boolean strContains(int[] arr, int value) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				return true;
			}
		}
		return false;
	}
}
