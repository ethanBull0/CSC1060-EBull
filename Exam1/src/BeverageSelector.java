import java.util.Scanner;
public class BeverageSelector {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int choice = 0;
	while (choice < 1 || choice > 3) {
	System.out.println("Choose a drink. (1) Water (2) Coke (3) Coffee");
	choice = scn.nextInt();
		}
	String drink = "";
	if (choice == 1) {
		drink = "Water";
	} else if (choice == 2) {
		drink = "Coke";
	} else if (choice == 3) {
		drink = "Coffee";
	}
	System.out.println("You chose (" + choice + ") " + drink + ".");
	}

}
