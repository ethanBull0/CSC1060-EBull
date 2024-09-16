import java.util.Scanner;
public class WhileStatement3 {

	public static void main(String[] args) {
		int guesses = 0;
		int userGuess = 0;
		int programGuess = (int)(Math.random() * 10);
		Scanner scn = new Scanner(System.in);
		System.out.println("I have guessed a number between 1 and 10. Guess it: ");
		for (guesses = 0; userGuess != programGuess; guesses++) {
			userGuess = scn.nextInt();
		}
	System.out.println("You took " + guesses + " guesses! Good job!");
	}
}
