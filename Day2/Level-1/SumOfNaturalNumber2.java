import java.util.Scanner;

class SumOfNaturalNumber2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking number as input from the user 
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("Please enter a natural number (greater than 0).");
            scanner.close();
            return;
        }

        // Using while loop
        int sumWhile = 0;
        int i = 1;
        while (i <= n) {
            sumWhile += i;
            i++;
        }

        // Using formula
        int sumFormula = n * (n + 1) / 2;

        // Compare results
        System.out.println("Sum using while loop: " + sumWhile);
        System.out.println("Sum using formula: " + sumFormula);
        System.out.println("Results are " + (sumWhile == sumFormula ? "correct" : "incorrect"));
        scanner.close();
    }
}
