import java.util.Scanner;

class WindChillTemperature  {
    // Function defination 
    public double calculateWindChill(double temperature, double windSpeed) {
        // Calculation of windChill 
        double windChill = 35.74 + 0.6215 + temperature + (0.4275 * temperature - 35.75) * windSpeed;
        
        return windChill;
    }

    public static void main(String[] args) {
        // Defining the scanner class object 
        Scanner sc = new Scanner(System.in);
        WindChillTemperature obj = new WindChillTemperature();

        // Taking input from the user 
        System.out.print("Enter temperature: ");
        double temperature = sc.nextDouble();

        System.out.print("Enter windSpeed: ");
        double windSpeed = sc.nextDouble();
        

        // calling function 
        double windChill = obj.calculateWindChill(temperature, windSpeed);

        // Output 
        System.out.println("The wind chill temperature is " + windChill);
        
        // Closing the scanner class object 
        sc.close();
    }
}
