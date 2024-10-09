import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Create an array and I will transpose it.");
		System.out.println("Enter rows: ");
		int rows = scn.nextInt();
		System.out.println("Enter columns: ");
		int columns = scn.nextInt();
		int[][] array = new int[rows][columns];
		System.out.println("Enter members of the array.");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = scn.nextInt();
			}
		}
		int[][] transposedArr = transpose(array);
		printArray(transposedArr);
	}

	public static int[][] transpose(int[][] arr) {
		int[][] transposeArr = new int[arr[0].length][arr.length]; // reversed from arr
		for (int i = 0; i < transposeArr.length; i++) {
			for (int j = 0; j < transposeArr[0].length; j++) {
				transposeArr[i][j] = arr[j][i];
			}
		}
		return transposeArr;
	}
// single dimensional version
	public static void transpose(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
}
