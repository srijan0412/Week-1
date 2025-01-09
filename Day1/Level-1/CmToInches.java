import java.util.Scanner;

class CmToInches {
	public static void main(String[] args) {
		
		//Initializing scanner class object
		Scanner input = new Scanner(System.in);
		
		//Taking height as input from the user
		System.out.print("Enter your height(in cm): ");
		int heightInCm = input.nextInt();
		
		//Calculating total no. of inches
		double inches = heightInCm/2.54;
		
		//Calculating foot from inches
		double feet = inches/12;
		
		System.out.println("Your Height in cm is " + heightInCm + " while in feet is " + feet + " and inches in " + inches);
		input.close();
		
	}
}