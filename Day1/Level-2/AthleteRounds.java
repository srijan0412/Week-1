import java.util.Scanner;

class AthleteRounds {
    public static void main(String[] args) {
        //Initializing the Scanner object
        Scanner scanner = new Scanner(System.in);

        // User inputs for triangle sides
        System.out.print("Enter side 1 of the triangle in meters: ");
        double side1 = scanner.nextDouble();
        
        System.out.print("Enter side 2 of the triangle in meters: ");
        double side2 = scanner.nextDouble();
        
        System.out.print("Enter side 3 of the triangle in meters: ");
        double side3 = scanner.nextDouble();

        // Calculate perimeter
        double perimeter = side1 + side2 + side3;

        // Calculate rounds to complete 5 km
        double distanceToRun = 5000; // 5 km in meters
        double rounds = distanceToRun / perimeter;

        // Output
        System.out.println("The total number of rounds the athlete will run is " + Math.ceil(rounds) + " to complete 5 km");
        scanner.close();
    }
}
