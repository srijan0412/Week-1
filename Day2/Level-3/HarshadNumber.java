import java.util.Scanner;
class HarshadNumber {
    public static void main(String[] args) {
		// Initializing the scanner object 
        Scanner input = new Scanner(System.in);

		//Taking the number as input from the user 
        System.out.print("Enter a number: ");
        int number = input.nextInt();
		
		//Assigning variable and sum to 0
        int originalNumber = number;
        int sum = 0;
		
		//Calculating a possible Harshad number
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
		
        //Output
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } 
        else {
            System.out.println(originalNumber + " is not a Harshad Number.");
        }
		
		input.close();
    }
}
