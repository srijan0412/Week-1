import java.util.Scanner;

class PowerOfNumber {
    public static void main(String[] args) {
        // Initializing the scanner object 
        Scanner input = new Scanner(System.in);

        // Taking number and power as input from the user 
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.print("Enter the power: ");
        int power = input.nextInt();

        // Initializing result variable as 1 
        int result = 1;

        // Calculating the power
        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        // Output 
        System.out.println("Result: " + result);

        input.close();
    }
}
