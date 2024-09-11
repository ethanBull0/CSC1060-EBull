import java.util.Scanner;
public class frontTimes {
	public static void main(String[] args) {
	String str;
	int nTimes;
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter string: ");
	str = scn.nextLine();
	System.out.println("Enter amount of times: ");
	nTimes = scn.nextInt();
	System.out.println(frontTimes(str, nTimes));
	}
	

public static String frontTimes(String str, int n) {
	  String nCopies;
	  if (n == 0) {
	    return "";
	  }
	  if (str.length() > 2) {
	  nCopies = str.substring(0, 3);
	  }
	  if (str.length() < 3) {
	  nCopies = str.substring(0, str.length());
	  }
	 for (int i = 1; i < n; i++) {
	  nCopies += str.substring(0, 3);
	 }
	 return nCopies;
	}
}