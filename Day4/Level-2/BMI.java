import java.util.Scanner;

public class BMI {

    // Method to calculate BMI for each person and populate the array
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0]; // Weight in kg
            double heightInMeters = data[i][1] / 100; // Convert height from cm to meters
            double bmi = weight / (heightInMeters * heightInMeters);
            data[i][2] = bmi; // Store BMI in the third column
        }
    }

    // Method to determine BMI status for each person
    public static String[] determineBMIStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2]; // Get the BMI
            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi >= 25 && bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][3]; // 2D array to store weight, height, and BMI

        // Input for weight and height
        for (int i = 0; i < data.length; i++) {
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble(); // Store weight in the first column

            System.out.print("Enter height (in cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble(); // Store height in the second column
        }

        // Calculate BMI for each person
        calculateBMI(data);

        // Determine BMI status for each person
        String[] bmiStatus = determineBMIStatus(data);

        // Display the results
        System.out.println("\nBMI Results:");
        System.out.println("Weight    Height    BMI       Status");
        for (int i = 0; i < data.length; i++) {
            System.out.println("------------------------------------------------");
            System.out.println("Weight: " + data[i][0] + " kg, Height: " + data[i][1] + " cm, BMI: " + data[i][2] + ", Status: " + bmiStatus[i]);
}

        // Close the scanner
        scanner.close();
    }
}