import java.util.Scanner;
public class MagicSquare {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Create an array and I will determine if it is a magic square.");
		System.out.println("Enter sizw: ");
		int size = scn.nextInt();
		int[][] array = new int[size][size];
		System.out.println("Enter members of the array.");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = scn.nextInt();
			}
		}
		System.out.println(magician(array));
	}

	public static boolean magician(int[][] arr) { //formula = size(size^2 + 1) / 2
		int size = arr.length;
		int magicTest = (int)(size * Math.pow(size, 2) + 1 / 2);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				
			}
		}
	}
}
