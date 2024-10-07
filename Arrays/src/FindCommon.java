//unsure what to do here
import java.util.Scanner;

public class FindCommon {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("I will find the common elements between two arrays.");
		System.out.println("Enter your first array length: ");
		int arrLen1 = scn.nextInt();
		System.out.println("Enter your first array: ");
		int[] array1 = new int[arrLen1];
		for (int i = 0; i < arrLen1; i++) {
			array1[i] = scn.nextInt();
		}
		System.out.println("Enter your second array length: ");
		int arrLen2 = scn.nextInt();
		System.out.println("Enter your second array");
		int[] array2 = new int[arrLen2];
		for (int j = 0; j < arrLen2; j++) {
			array2[j] = scn.nextInt();
		}
	
		
		System.out.println(sharedArrMembers(array1, array2));
	}

	public static String sharedArrMembers(int[] a, int[] b) {
		int minimum = Math.min(a.length, b.length);
		int maximum = Math.max(b.length, a.length);
		int[] smallArr;
		int[] bigArr;
		/* if (minimum == a.length) {
			for (int i = 0; i < a.length; i++) {
				smallArr[i] = a[i];
			}
			for (int i = 0; i < b.length; i++) {
				bigArr[i] = b[i];
			}
		} else {
			for (int i = 0; i < b.length; i++) {
				smallArr[i] = b[i];
			}
			for (int i = 0; i < a.length; i++) {
				bigArr[i] = a[i];
			} 
		} */
		int[] common = new int[minimum];
		for (int i = 0; i < minimum; i++) {
			for (int j = 0; j < maximum; j++) {
				
			}
		}
		return common.toString();
	}
}
