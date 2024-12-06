import java.util.Scanner;
import java.util.ArrayList;

public class DiceGame {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of sides of the game's die:");
		int sides = scn.nextInt();
		Die die = new Die(sides, 0);
		System.out.println("We will use a D" + sides);
		System.out.println("Enter your number of players: ");
		int numPlayers = scn.nextInt();
		Player[] players = new Player[numPlayers];
		String flush = scn.nextLine();
		for (int i = 0; i < numPlayers; i++) { //loop to assign players
			System.out.println("Enter the name of player " + (i + 1));
			String player = scn.nextLine();
			players[i] = new Player(player, die); //use this.die?
			System.out.println("Player " + (i + 1) + ": " + player);
		}
		int[] rollValues = new int[numPlayers];
		for (int i = 0; i < numPlayers; i++) { //loop to roll die
			players[i].playerRoll();
			System.out.println("Player " + players[i].getName() + " rolled a " + players[i].getDie().getValue() + " on a " + die.getNumSides() + " sided die");
			rollValues[i] = players[i].getDie().getValue();
		}
		ArrayList<Integer> winningVals = decideWinner(rollValues);
		for (int i = 0; i < winningVals.size(); i++) {
			int thisValue = winningVals.get(i);
			System.out.println("Player " + players[thisValue].getName() + " wins");
		}
	}
	
	public static ArrayList<Integer> decideWinner(int[] rolls) {
		ArrayList<Integer> winningIndex = new ArrayList<>();
		int winningRoll = 0;
		for (int i = 0; i < rolls.length; i++) {
			if (rolls[i] > winningRoll) {
				winningRoll = rolls[i];
			}
		}
		for (int i = 0; i < rolls.length; i++) {
			if (rolls[i] == winningRoll) {
				winningIndex.add(i);
			}
		}
		return winningIndex;
	}

}
