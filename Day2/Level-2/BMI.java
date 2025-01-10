import java.util.Scanner;

class BodyMassIndex{
    public static void main(String[] args) {
        // Initializing the scanner object 
        Scanner scanner = new Scanner(System.in);

        // Taking weight and height as input from the user
        System.out.print("Enter weight in kg: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = scanner.nextDouble();

        // Converting height into meters (from cm)
        height = height / 100;

        // Calculating BMI 
        double bmi = weight / (height * height);

        // Output 
        System.out.println("BMI: " + bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 24.9) {
            System.out.println("Normal weight");
        } else if (bmi < 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obesity");
        }

        scanner.close();        
    }
}
