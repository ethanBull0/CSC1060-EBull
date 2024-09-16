import java.util.Scanner;
public class WhileStatement2 {
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int programsGuess = (int)(Math.random() * 10);
	char userGuess = 'n';
	int numGuesses = 0;
	System.out.println("Pick a number 1 through 10. I'm going to guess until you say I got your number.");
	while (userGuess == 'n' || userGuess == 'N') {
		System.out.println("My guess is: " + programsGuess + ", was I correct? (Y/N)");
		userGuess = (scn.next().charAt(0));
		programsGuess = (int)(Math.random() * 10);
		numGuesses++;
		}
	System.out.println("I took " + numGuesses + " to get it right!");
	}
}
