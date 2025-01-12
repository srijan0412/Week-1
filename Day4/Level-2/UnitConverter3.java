public class UnitConverter3 {
    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        // Convert Fahrenheit to Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        // Convert Celsius to Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;
        return fahrenheit;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        // Convert pounds to kilograms
        double pounds2kilograms = 0.453592;
        double kilograms = pounds * pounds2kilograms;
        return kilograms;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        // Convert kilograms to pounds
        double kilograms2pounds = 2.20462;
        double pounds = kilograms * kilograms2pounds;
        return pounds;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        // Convert gallons to liters
        double gallons2liters = 3.78541;
        double liters = gallons * gallons2liters;
        return liters;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        // Convert liters to gallons
        double liters2gallons = 0.264172;
        double gallons = liters * liters2gallons;
        return gallons;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Test conversions
        double fahrenheit = 32;
        double celsius = convertFahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " Fahrenheit is " + celsius + " Celsius.");

        celsius = 0;
        fahrenheit = convertCelsiusToFahrenheit(celsius);
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit.");

        double pounds = 10;
        double kilograms = convertPoundsToKilograms(pounds);
        System.out.println(pounds + " pounds is " + kilograms + " kilograms.");

        kilograms = 4.53592;
        pounds = convertKilogramsToPounds(kilograms);
        System.out.println(kilograms + " kilograms is " + pounds + " pounds.");

        double gallons = 1;
        double liters = convertGallonsToLiters(gallons);
        System.out.println(gallons + " gallons is " + liters + " liters.");

        liters = 3.78541;
        gallons = convertLitersToGallons(liters);
        System.out.println(liters + " liters is " + gallons + " gallons.");
    }
}