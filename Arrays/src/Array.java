
public class Array {

	public static void main(String[] args) {
		int num;

		int[] numbers;
		String[] greetings = { "hello", "hi", "bonjour" };

		numbers = new int[5];

		numbers[0] = -2;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
		numbers[4] = 5;

		num = numbers[4];
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
			if (i < 3) {
				System.out.println(greetings[i]);
			}
		}
		int[] numReverse = arrSwap(numbers);
		System.out.println("in reverse: ");
		for (int i = 0; i < numReverse.length; i++) {
			System.out.print(numReverse[i] + " ");
		}
	}

	public static int[] arrSwap(int[] a) {
		int temp = 0;
		for (int i = 0; i < a.length / 2; i++) {
			temp = a[i];
			a[i] = a[a.length - 1 - i]; //old a[length - 1 - i] becomes a[i]
			a[a.length - 1 - i] = temp; //old a[i] becomes a[length - 1 - i]
		}
		return a;
	}
}
