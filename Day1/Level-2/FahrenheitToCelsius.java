import java.util.Scanner;

class FahrenheitToCelsius {
    public static void main(String[] args) {

        //Initializing the Scanner object
        Scanner scanner = new Scanner(System.in);
        
        //Taking temperature as input from the user
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        
        // Calculating Fahrenheit from celsius 
        double celsiusResult = (fahrenheit - 32) * 5/9;

        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius");
        scanner.close();
    }
}

