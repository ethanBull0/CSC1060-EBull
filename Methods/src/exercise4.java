import java.util.Scanner;
public class exercise4 {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int num;
	System.out.println("Enter a number 1 through 7 and I will provide the corresponding weekday: ");
	num = scn.nextInt();
	System.out.println(getWeekDay(num));
	}
	public static String getWeekDay(int num) {
	if (num == 1) {
		return "Sunday";
	} else if (num == 2) {
		return "Monday";
	} else if (num == 3) {
		return "Tuesday";
	} else if (num == 4) {
		return "Wednesday";
	} else if (num == 5) {
		return "Thursday";
	} else if (num == 6) {
		return "Friday";
	} else if (num == 7) {
		return "Saturday";
	}
	return "Not a weekday";
	}
}
