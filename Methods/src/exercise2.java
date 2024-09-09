import java.util.Scanner;
public class exercise2 {

	public static void main(String[] args) {
	int n1, n2, n3;
	Scanner scn = new Scanner(System.in);
	System.out.println("Input 3 numbers: ");
	n1 = scn.nextInt();
	n2 = scn.nextInt();
	n3 = scn.nextInt();
	System.out.println(greatestNum(n1, n2, n3));
	}

	public static int greatestNum(int num1, int num2, int num3) {
	if (num1 < num2 && num2 < num3) {
	return num3;
		} else if (num2 > num1)  {
		return num2;
		} 
	return num1;
	}
}
