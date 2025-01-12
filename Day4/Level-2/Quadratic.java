import java.util.Scanner;

public class Quadratic {
    public static void findRoots(double a, double b, double c) {
        // Calculate delta
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            // Two distinct roots
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("The roots are: ");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (delta == 0) {
            // One double root
            double root = -b / (2 * a);
            System.out.println("There is one root: ");
            System.out.println("Root: " + root);
        } else {
            // No real roots
            System.out.println("The equation has no real roots.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user : a, b, and c
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        // Calculate the roots
        findRoots(a, b, c);

        // Close the scanner
        scanner.close();
    }
}