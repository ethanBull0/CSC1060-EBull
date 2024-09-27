package defaul;

import java.util.Scanner;

public class Scrabble2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the set of tiles: ");
		String tiles = scn.nextLine();
		System.out.println("Enter your test word: ");
		String test = scn.nextLine();
		System.out.println("returned " + canSpell(tiles, test));
	}

	public static boolean canSpell(String tiles, String test) {
		if (tiles.contains(test)) {
			return true;
		}
		return false;
	}
}