import java.util.Scanner;
public class bubbleSort {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

	}

	public static String[] bubbleSort(String[] strs, boolean isReverseSorted) {
		if (strs.length <= 1) {
			return strs;
		}
		int i = 1;
		for (String s : strs) {
			int test = s.compareTo(strs[i]);
			if (test < 0) { //put str in an arraylist/array of strings that will be sorted
				
			}
		}
	}
}
