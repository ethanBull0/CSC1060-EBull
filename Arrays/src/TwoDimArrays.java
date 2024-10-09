import java.util.Scanner;

public class TwoDimArrays {

	public static void main(String[] args) {
		//int columns = 2;
		//int rows = 5;
		//int[][] arr = new int[rows][columns];
		int[][] my2Dim = {
				{1, 2, 3}, //row 0
				{4, 5, 6}, //row 1
				{7, 8, 9} //row 2
				};
		printArray(my2Dim);
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
