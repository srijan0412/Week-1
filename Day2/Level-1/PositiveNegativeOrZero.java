import java.util.Scanner;

public class PositiveNegativeOrZero {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Taking the number as input from the user
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        // Checking if the number is positive, negative or zero.
        if (number > 0) {
            // Number is positive 
            System.out.println("Number is positive");
        }
        else if (number < 0){
            // Number is Negative 
            System.out.println("Number is Negative");
        }
        else {
            // Number is zero 
            System.out.println("Number is Zero");
        }
        
        scanner.close();
    }
}
