
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

	}

}
