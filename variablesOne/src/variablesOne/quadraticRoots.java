package variablesOne;
import java.util.Scanner;
public class quadraticRoots {

	public static void main(String[] args) {
		int varA;
		int varB;
		int varC;
		Scanner scm = new Scanner(System.in);
		System.out.print("Enter a: ");
		varA = scm.nextInt();
		System.out.print("Enter b: ");
		varB = scm.nextInt();
		System.out.print("Enter c: ");
		varC = scm.nextInt();
		if (varA == 0) {
			System.out.println("Divide by 0 error!");
		}
		double quadFormulaPositive = ((varB * -1) + Math.sqrt(Math.pow(varB, 2) -4 * varA * varC)) / (varA * 2);
		double quadFormulaNegative = ((varB * -1) - Math.sqrt(Math.pow(varB, 2) -4 * varA * varC)) / (varA * 2);
		System.out.println("The roots of the qudaratic are: " + quadFormulaPositive + ", " + quadFormulaNegative);
		
	}

}
