import java.util.Scanner;

public class UnitConverter {
    // Function definations : 
    public static double convertKmToMiles(double km) {
        // Convert km to miles
        double km2miles = 0.621371;
        double miles = km * km2miles;

        return miles;
    }

    public static double convertMilesToKm(double miles) {
        // Converting miles to km
        double miles2km = 1.60934;
        double km = miles * miles2km;

        return km;
    }

    public static double convertMetersToFeet(double meter) {
        // Converting Meters to feets
        double meters2feet = 3.28084;
        double feet = meter * meters2feet;

        return feet;
    }

    public static double convertFeetsToMeters(double feet) {
        // Converting feets to meters.
        double feet2meters = 0.3048;
        double meters = feet * feet2meters;

        return meters;
    }



    public static void main(String[] args) {
        // Defining the scanner class object 
        Scanner sc = new Scanner(System.in);

        // Takeing 'km' as input from the user
        System.out.print("Enter the distance in kilometers: ");
        double km = sc.nextDouble();

        // Calling the method to convert km to miles
        double miles = UnitConverter.convertKmToMiles(km); 

        // Displaying value in miles
        System.out.println("Distance in miles: " + miles);

        // Close the Scanner object
        sc.close();
    }
}
