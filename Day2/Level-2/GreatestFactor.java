import java.util.Scanner;

class GreatestFactor {
    public static void main(String[] args) {
        // Initializing the scanner object 
        Scanner input = new Scanner(System.in);

        // Taking number as input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Initializing greatestFactor as 1
        int greatestFactor = 1;

        // Calculating the greatest factor
        for (int i = number - 1; i > 0; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }

        // output 
        System.out.println("Greatest Factor: " + greatestFactor);
        input.close();
    }
}