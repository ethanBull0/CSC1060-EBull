import java.util.Scanner;
public class bubbleSort {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

	}

	public static String[] bubbleSort(String[] strs, boolean isReverseSorted) {
		String[] sorted = new String[strs.length];
		if (strs.length <= 1) {
			return strs;
		}
		
		for (int j = 0; j < strs.length; j++) {
			for (int i = 0; i < strs.length - 1; i++) {
				String index1 = strs[i];
				String index2 = strs[i + 1];
				if (isReverseSorted) {
					index1 = strs[i + 1];
					index2 = strs[i];
				}
				int test = index1.compareTo(index2);
				if (test < 0) { //strs[i+1] after strs[i]
					sorted[i] = index1;
					sorted[i + 1] = index2;
				} else if (test > 0) {//strs[i] after strs[i+1]
					sorted[i + 1] = index1;
					sorted[i] = index2;
				} else if (test == 0) {//do either
					sorted[i] = index1;
					sorted[i + 1] = index2;
				}
			}
		}
		return sorted;
	}
}
