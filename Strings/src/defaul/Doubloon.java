package defaul;

import java.util.Scanner;

public class Doubloon {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a string. True means the string is a doubloon, false means it is not. ");
		String str = scn.nextLine();
		System.out.println("returned " + isDoubloon(str));
	}

	public static boolean isDoubloon(String str) {
		String strLow = str.toLowerCase();
		// char[] strArray = str.toCharArray();
		for (int i = 0; i < strLow.length(); i++) {
			if (strLow.indexOf(strLow.charAt(i)) == (strLow.lastIndexOf(strLow.charAt(i)))) {
				return false;
			}
		}
		return true;
	}
}
