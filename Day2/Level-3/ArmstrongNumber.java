import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {
        // Initializing the scanner object 
        Scanner input = new Scanner(System.in);

		//Taking the number as input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

		//Initializing sum as 0 and setting up originalNumber.
        int sum = 0;
        int originalNumber = number;
		
		//Verifying for Armstrong Number
        while (originalNumber != 0) {
            int remainder = originalNumber % 10;
            sum += Math.pow(remainder, 3);
            originalNumber /= 10;
        }
        
        // Output 
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } 
        else {
            System.out.println(number + " is not an Armstrong Number.");
        }

		input.close();
    }
}
