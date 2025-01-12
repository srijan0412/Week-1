class UnitConverter2 {
    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        // Converting yards to feet
        double yards2feet = 3;
        double feet = yards * yards2feet;

        return feet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        // Converting feet to yards
        double feet2yards = 0.333333;
        double yards = feet * feet2yards;

        return yards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        // Converting meters to inches
        double meters2inches = 39.3701;
        double inches = meters * meters2inches;

        return inches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        // Converting inches to meters
        double inches2meters = 0.0254;
        double meters = inches * inches2meters;

        return meters;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        // Converting inches to centimeters
        double inches2cm = 2.54;
        double centimeters = inches * inches2cm;

        return centimeters;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Test conversions

        double yards = 10;
        double feetFromYards = convertYardsToFeet(yards);
        System.out.println(yards + " yards is " + feetFromYards + " feet.");

        double feet = 30;
        double yardsFromFeet = convertFeetToYards(feet);
        System.out.println(feet + " feet is " + yardsFromFeet + " yards.");

        double meters = 1;
        double inches = convertMetersToInches(meters);
        System.out.println(meters + " meter is " + inches + " inches.");

        inches = 39.3701;
        meters = convertInchesToMeters(inches);
        System.out.println(inches + " inches is " + meters + " meters.");

        inches = 10;
        double centimeters = convertInchesToCentimeters(inches);
        System.out.println(inches + " inches is " + centimeters + " centimeters.");
    }
}