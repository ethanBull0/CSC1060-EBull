import java.util.Scanner;
public class exercise3 {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	float num;
	num = scn.nextFloat();
	valueCheck(num);
	}
	public static void valueCheck(float n) {
	 if (n < 0) {
		 System.out.println("Number is less than 0");
	 }  else if (n > 0) {
		 System.out.println("Number is greather than 0");
	 } else if (n == 0) {
		 System.out.println("Number is equal to 0");
	 }
	}
}