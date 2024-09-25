package defaul;
import java.util.Scanner;
public class Doubloon {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a string, and I will determine if it is a doubloon: ");
		String str = scn.nextLine();
		System.out.println("returned " + isDoubloon(str));
	}

	public static boolean isDoubloon(String str) {
		char[] strArray = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			
		}
		return false;
	}
}
