//triangle only prints out half of a full triangle
import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int size;
		char fill;
		char choice = 0;
	
	while (choice != 'n') {
		System.out.println("Enter size: ");
		size = scn.nextInt();
		while (size > 50 || size < 1) {
			System.out.println("Size must be between 1 and 50!");
			System.out.println("Enter size: ");
			size = scn.nextInt();
		}
		System.out.println("Enter fill: ");
		//filter newlines?
		fill = scn.next().charAt(0);
		triFill(size,fill);
		System.out.println("Would you like another triangle? Y/N");
		choice = scn.next().charAt(0);
		}
	}


	public static void triFill(int size, char fill) {
		String stringFill = String.valueOf(fill) + " "; //char to string
		String empty = " ";
		int i = 0;
		while (i < (size)) {
		System.out.println(empty.repeat((size) - i) + stringFill.repeat(i + 1) + empty.repeat((size) + i));
		i++; //less leftside rows, more rightside rows.
	}
}
}
