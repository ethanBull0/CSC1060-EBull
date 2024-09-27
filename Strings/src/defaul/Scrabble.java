package defaul;

import java.util.Scanner;

public class Scrabble {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the set of tiles: ");
		String tiles = scn.nextLine();
		System.out.println("Enter your test word: ");
		String test = scn.nextLine();
		System.out.println("returned " + canSpell(tiles, test));
	}

	public static boolean canSpell(String tiles, String test) {
		for (int i = 0; i < test.length(); i++) {
			if (tiles.indexOf(test.charAt(i)) == -1) { //if there is no tile for that test word
				return false; //tile does not exist - we cannot make the word.
			}
			tiles.replace(test.charAt(i), ' ');//remove the first index of that tile in the tile set - we can no longer use it. 
		}
		
		return true;

	}

	public static String repeatRemover(String tiles) { // removes all repeated characters
		String noRepeats = "";
		for (int i = 0; i < tiles.length(); i++) {
			if (noRepeats.indexOf(tiles.charAt(i)) == -1) { // we will not add the char if it exists in norepeats
				noRepeats += tiles.charAt(i);
			}
		}
		return noRepeats;
	}
}
