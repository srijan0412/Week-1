import java.util.Scanner;

class EuclideanDistanceAndLineEquation {

    // Method to calculate the Euclidean distance between two points
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to find the slope and y-intercept of the line given two points
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double[] result = new double[2]; // result[0] = slope (m), result[1] = y-intercept (b)
        
        // Calculate slope (m)
        double m = (y2 - y1) / (x2 - x1);
        result[0] = m;

        // Calculate y-intercept (b)
        double b = y1 - m * x1;
        result[1] = b;

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first point (x1, y1)
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();

        // Input for the second point (x2, y2)
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        // Calculate the Euclidean distance
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance: " + distance);

        // Find the line equation
        double[] lineEquation = findLineEquation(x1, y1, x2, y2);
        double slope = lineEquation[0];
        double yIntercept = lineEquation[1];

        // Display the line equation
        System.out.printf("Line Equation: y = %.2fx + %.2f%n", slope, yIntercept);

        scanner.close();
    }
}