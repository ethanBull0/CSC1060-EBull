import java.util.Scanner;
public class RightAngleLoop {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter number of rows: ");
	int amount = scn.nextInt();
	getUserNumber(amount);
	}
	
	public static void getUserNumber(int rows) {
		String numLoop = "";
	for (int i = 1; i < rows + 1; i++) {
		numLoop += i;
		System.out.println(numLoop);
		}
	}
}
