import java.util.Scanner;

public class MultTable {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the size of your multiplication table: ");
		int size = scn.nextInt() + 1;
		int[][] table = new int[size][size];
		mulTable(table);
		printArray(table);
	}

	public static void mulTable(int[][] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr[0].length; j++) {
				arr[i][j] = i * j;
			}
		}
	}

	public static void printArray(int[][] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
}
