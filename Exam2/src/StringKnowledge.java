
public class StringKnowledge {

	public static void main(String[] args) {

	}

	public static int howManyCat(String str) {
		int instances = 0;
		for (int i = 0; i < str.length() - 2; i++) { // -2 to stay in bounds when we check "cat"
			if (str.substring(i, i + 3).equals("cat")) {
				instances++;
			}
		}
		return instances;
	}

	public static boolean endOther(String a, String b) {
		int aLength = a.length();
		int bLength = b.length();
		if (a.contains(b)) {
			if (a.substring(aLength - bLength, aLength).equals(b)) {
				return true;
			}
		}
		if (b.contains(a)) {
			if (a.substring(bLength - aLength, bLength).equals(a)) {
				return true;
			}
		}

		return false;
	}
}
