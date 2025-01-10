import java.util.Scanner;

class OddEvenNumbers {
    public static void main(String[] args) {
		//Initializing a Scanner class object 
        Scanner scanner = new Scanner(System.in);

        //Taking input from the user
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();

        // Checking if the input is a natural number
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number greater than 0.");
            System.exit(0);
        }

        // Initializeing arrays for odd and even numbers
        int[] oddNumbers = new int[number / 2 + 1];
        int[] evenNumbers = new int[number / 2 + 1];

        // Index variables for odd and even arrays
        int oddIndex = 0;
        int evenIndex = 0;

        // Populate odd and even arrays
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i;
            } else {
                oddNumbers[oddIndex++] = i;
            }
        }

        // Print odd numbers array
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();

        // Print even numbers array
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();

        // Closing the scanner object 
        scanner.close();
    }
}
