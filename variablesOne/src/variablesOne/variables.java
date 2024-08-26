package variablesOne;

public class variables {

	public static void main(String[] args) {
		double num3 = 5.4;
		double num4 = 32.2;
		int num1 = (int)num3;
		int num2 = (int)num4;
		float sumNums = num1 + num2;
		System.out.println("the addition result is: " + sumNums);
		float subtractNums = num1 - num2;
		System.out.println("the subtraction result is: " + subtractNums);	
		float multiplyNums = num1 * num2;
		System.out.println("the multiplication result is: " + multiplyNums);
		float divideNums = ((short)num1 / num2);
		System.out.println("the division result is: " + divideNums);
		float moduloNums = num1 % num2; 
		System.out.println("the modulo result is: " + moduloNums); 
		System.out.println(num1 + " " + num2);
		System.out.println(num3 + " " + num4);
		System.out.println(Math.sqrt(num1));
		
	}

}
