import java.util.Scanner;
public class HashBox {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter number of rows: ");
	int rows = scn.nextInt();
	System.out.println("Enter number of columns: ");
	int columns = scn.nextInt();
	Boxes(rows, columns);
	whileBoxes(rows, columns);
	}

	public static void Boxes(int rows, int columns) {
		for (int i = 0; i < columns; i++) {
			for (int j = 0; j < rows; j++) {
			System.out.print("#");	
			}
		System.out.print("\n");
		}
	}

public static void whileBoxes(int rows, int columns) {
	int i = 0;
	int j = 0;
	while (i < columns) {
	while (j < rows) {
	System.out.print("#");	
		j++;
		}
	System.out.print("\n");
		i++;
		}
	}
}