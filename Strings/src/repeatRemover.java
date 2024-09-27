
public class repeatRemover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
