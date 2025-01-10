import java.util.Scanner;

class CountDigits {
    public static void main(String[] args) {
		// Initializing the scanner object 
        Scanner input = new Scanner(System.in);

		//Taking the number as input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

		//initializing a counter variable 'count' to 0
        int count = 0;

        // Counting digits in number
        while (number != 0) {
            number /= 10;
            count++;
        }

		// Output
        System.out.println("Number of digits: " + count);
		
		input.close();
    }
}
