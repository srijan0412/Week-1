import java.util.Scanner;

class FizzBuzzFor {
    public static void main(String[] args) {
        // Initializing the Scanner object 
        Scanner scanner = new Scanner(System.in);

        // Taking number as input from the user 
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // printing Fizz & Buzz according to the given condition 
        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }

        // Closing the scanner object 
        scanner.close();
    }
}
