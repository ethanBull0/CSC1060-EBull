
public class ArrayKnowledge {

	public static void main(String[] args) {

	}

	public static boolean hasxx(char[] characters) {
		for (int i = 0; i < characters.length - 1; i++) { // -1 so we can check ahead for x
			if (characters[i] == 'x') {
				if (characters[i + 1] == 'x') {
					return true;
				}
			}
		}
		return false;
	}

	public static int[] fromToArray(int start, int end) { // end is exclusive
		int[] result = new int[end - start];
		for (int i = 0; i < result.length; i++) {
			result[i] = start + i;
		}
		return result;
	}
}
