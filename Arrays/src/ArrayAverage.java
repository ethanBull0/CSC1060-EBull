import java.util.Scanner;

public class ArrayAverage {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("I will find the average value of your array, without the largest or smallest values.");
		System.out.println("Enter your array length: ");
		int arrLen = scn.nextInt();
		int[] array = new int[arrLen];
		System.out.println("Enter your array values: ");
		for (int i = 0; i < arrLen; i++) {
			array[i] = scn.nextInt();
		}
		System.out.println(arrayAvg(array));
	}

	public static int arrayAvg(int[] arr) {
	int mean = 0;
	int biggest = 0;
	int smallest = 32767;
	for (int i = 0; i < arr.length; i++) { //loop to find biggest and smallest values
		biggest = Math.max(biggest, arr[i]);
		smallest = Math.min(smallest, arr[i]);
		}
	int[] arrExclusive = new int[arr.length - 2]; //arr, without the largest and smallest values.
	for (int i = 0; i < arrExclusive.length; i++) { //loop to assign arr to all values except smallest and biggest
	if (arr[i] != biggest || arr[i] != smallest) {
		arrExclusive[i] = arr[i];
	} else {
		i--; //realign the index?
	}
	}
	for (int i = 0; i < arrExclusive.length; i++) {
		mean += arrExclusive[i];
	}
	mean  = mean / arrExclusive.length;
	return mean;
	}
}
