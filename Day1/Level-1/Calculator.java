import java.util.Scanner;

class Calculator {
	public static void main(String[] args){
		
		//Initializing scanner class object
		Scanner input = new Scanner(System.in);
		
		//Taking Number1 & Number2 as input from the user
		int number1, number2;
		System.out.print("Enter number1: ");
		number1 = input.nextInt();
		
		System.out.print("Enter number2: ");
		number2 = input.nextInt();
		
		//Calculating addition, subtraction, multiplication and division
		int addition = number1 + number2;
		int subtraction = number1 - number2;
		int multiplication = number1 * number2;
		int division = 0;
		if (number2 != 0) {
			division = number1 / number2;
		}
		
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " + addition + ", " + subtraction + ", " + multiplication + ", and " + division );
		input.close(); 
	
	}
}