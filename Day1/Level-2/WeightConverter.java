import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter weight in pounds: ");
        double weightInPounds = scanner.nextDouble();

        // Convert to kilograms
        double weightInKg = weightInPounds / 2.2; // 1 pound = 0.454 kg, so we divide by 2.2 for conversion

        // Output
        System.out.println("The weight of the person in pounds is " + weightInPounds + " and in kg is " + weightInKg);
        
        scanner.close();
    }
}