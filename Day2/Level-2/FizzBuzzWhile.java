import java.util.Scanner;

class FizzBuzzWhile {
    public static void main(String[] args) {
        // Initializing the Scanner object 
        Scanner scanner = new Scanner(System.in);

        // Taking number as input from the user 
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int i = 1;

        // printing Fizz & Buzz according to the given condition 
        if (number > 0) {
            while (i <= number) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
                i++;
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }

        // Closing the scanner object 
        scanner.close();
    }
}
