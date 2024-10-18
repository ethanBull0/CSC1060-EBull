
public class LogicKnowledge {

	public static void main(String[] args) {

	}

	public static int pickNumber(int a, int b, int c) {
		if (a != b && b != c && a != c) { // none are the same
			return a + b + c;
		}
		if (a == b && b == c) { // all numbers are the same
			return a;
		}
		if (a == b) { // two are the same
			return c;
		}
		if (a == c) { // two are the same
			return b;
		}
		if (b == c) { // two are the same
			return a;
		}
		return 0;
	}

	public static boolean equiDistance(int a, int b, int c) {
		int small = Math.min(Math.min(a, b), c);
		int medium = Math.max(Math.min(a, b), c);
		int big = Math.max(Math.max(a, b), c);
		int smallMedDiff = Math.abs(medium - small);
		int medBigDiff = Math.abs(big - medium);
		if (smallMedDiff == medBigDiff) {
			return true;
		}
		return false;
	}
}
