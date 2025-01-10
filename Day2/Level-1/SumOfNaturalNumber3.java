import java.util.Scanner;

class SumOfNaturalNumber3 {
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

        // Using for loop
        int sumFor = 0;
        for (int i = 1; i <= n; i++) {
            sumFor += i;
        }

        // Using formula
        int sumFormula = n * (n + 1) / 2;

        // Compare results
        System.out.println("Sum using while loop: " + sumFor);
        System.out.println("Sum using formula: " + sumFormula);
        System.out.println("Results are " + (sumFor == sumFormula ? "correct" : "incorrect"));
        scanner.close();
    }
}
