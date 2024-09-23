import java.util.Scanner; //hint: use a really high number and have fun :)
public class RowsOf10 {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter an amount of numbers and I will print them in length 10 rows");
	int amount = scn.nextInt();
	rowPrint(amount);
	}

	public static void rowPrint(int n) {
	int count;
	 for (int i = 1; i <= n; i++) {
		 if ((i - 1) % 10 == 0) {
			 System.out.print("\n");
		 }
	System.out.print(i + " ");
	 }
	}
}
