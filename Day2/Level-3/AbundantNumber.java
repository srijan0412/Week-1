import java.util.Scanner;
class AbundantNumber {
    public static void main(String[] args) {
        // Initializing the scanner object 
        Scanner input = new Scanner(System.in);
		
        // Taking the number as input from the user 
        System.out.print("Enter a number: ");
        int number = input.nextInt();

		// Initializing the sum variable to 0
        int sum = 0;
		
        // Calculating the sum
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Output 
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } 
        else {
            System.out.println(number + " is not an Abundant Number.");
        }

		input.close();
    }
}
