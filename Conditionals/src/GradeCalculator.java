import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int grade;
		System.out.println("Enter your grade value: ");
		grade = scn.nextInt();
		System.out.println(gradeCalc(grade));
	}

	public static String gradeCalc(int num) {
		if (num > 92) {
			return "A";
		} else if (num < 92 && num >= 89) {
			return "A-";
		} else if (num < 89 && num >= 87) {
			return "B+";
		} else if (num < 87 && num >= 82) {
			return "B";
		} else if (num < 82 && num >= 79) {
			return "B-";
		} else if (num < 79 && num >= 77) {
			return "C+";
		} else if (num < 77 && num >= 72) {
			return "C";
		} else if (num < 72 && num >= 69) {
			return "C-";
		} else if (num < 69 && num >= 67) {
			return "D+";
		} else if (num < 67 && num >= 60) {
			return "D";
		} else if (num < 60 && num > 0) {
			return "F";
		} else {
			return "Invalid grade";
		}
	}
}
