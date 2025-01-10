import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // taking number as input from the user
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();

        // If number is not natural
        if (number < 1) {
            System.out.println("Please enter a natural number (greater than 0).");
            scanner.close();
            return;
        }

        // Printing the number as per even and odd 
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is an even number.");
            } else {
                System.out.println(i + " is an odd number.");
            }
        }
        scanner.close();
    }
}
